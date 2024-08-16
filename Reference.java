// Reference to a stativ member
/*
interface A{
    public void sum(int a, int b);
}
class B{
    public static void add(int a,int b){
        System.out.println("sum is : " +(a+b));
    }
}
class Reference{
    public static void main(String[] args) {
        A a = B::add;
        a.sum(5,6);
        
    }
}
*/


// Reference to a non-static member
/*
interface A{
    public void sum(int a, int b);
}
class B{
    public void add(int a,int b){
        System.out.println("sum is : " +(a+b));
    }
}
class Reference{
    public static void main(String[] args) {
        A a = new B()::add;
        a.sum(5,6);
        
    }
}
*/


// Reference to  a constructor
/*
interface A{
    public void sum(int a, int b);
}
class B{
    B(int a,int b){
        System.out.println("sum is : " +(a+b));
    }
}
class Reference{
    public static void main(String[] args) {
        A a = B::new;
        a.sum(5,6);
        
    }
}
*/