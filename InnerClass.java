class A
{
    public void hello(){
        System.out.println("hello world.");

    }
    class B
    {
        public void hi(){
            System.out.println("yohohoho");

        }
    }
}

public class InnerClass
{
    public static void main(String[] args) {
        A obj = new A();
        obj.hello();

        A.B innerObj = obj.new B();             //creating objects of innerclass using .
        innerObj.hi();
    }
}