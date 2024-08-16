/*
Inheretence is a concept of OOPs in which a class is able to inherit or access features, parameters or methods of a class
The class which inherits features of another class is known as 'Child class' and the class whose features is being inherited is known as 'Parent class'
keyword we use to inherit a class is 'extends'
*/

class Person{
    String name;
    
    void PrintName(){
        System.out.println("Your name is : "+ name);
    }
}
class Student extends Person{
    int rollno;

    Student(int i, String n) {
        super.name = n; // Call the Person constructor with the name argument
        rollno = i;
      }
    void PrintRollno(){
        System.out.println("Your Roll no is : " + rollno);
    }
    
}
class inheretence{
    public static void main(String[] args) {
        Student s1 = new Student(52,"mayur");
        s1.PrintName();
        s1.PrintRollno();

    }
}