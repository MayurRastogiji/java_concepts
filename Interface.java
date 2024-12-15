/*
  Interface is a type of class in java which is used to declare methods
  We cannot create object of interface
  we can inherit an interface into an interface or in class
  While inheriting interface into interface we use 'extends' keyword, while inheriting interace to class we use 'implements' keyword.
  Interfaces are of three types
  .) Normal interface - which is used to declare number of methods
  .) Functional interface - which is used to declare only 1 method
  .) marker interface - (used for serialisation and deserialisation), does not declare any method
 */

 interface A {                  //Noremal interface
    void sum();
    void mul();
 }
 interface C{                   //functional interface
    String hello();
 }
 interface d{                   //marker ihnterface

 }

 class B implements A{
    int a,b;
    B(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void sum(){
        System.out.println("Sum is : "+ (a+b));
    }
    @Override
    public void mul(){
        System.out.println("MUl is : "+ (a*b));
    }
 }
 public class Interface{
    public static void main(String[] args) {
        B b1 =new B(5,8);
        b1.sum();
        b1.mul();
        C obj = () -> "Hello world";            //lambda function to override functional interrface
        System.out.println(obj);
    }
 }