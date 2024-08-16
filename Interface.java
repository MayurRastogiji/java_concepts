/*
  Interface is a type of class in java which is used to declare methods
  We cannot create object of interface
  we can inherit an interface into an interface or in class
  While inheriting interface into interface we use 'extends' keyword, while inheriting interace to class we use 'implements' keyword.
 */

 interface A {
    void sum();
    void mul();
 }

 class B implements A{
    int a,b;
    B(int i,int j){
        a = i;
        b = j;
    }
    public void sum(){
        System.out.println("Sum is : "+ (a+b));
    }
    public void mul(){
        System.out.println("MUl is : "+ (a*b));
    }
 }
 class Interface{
    public static void main(String[] args) {
        B b1 =new B(5,8);
        b1.sum();
        b1.mul();
    }
 }