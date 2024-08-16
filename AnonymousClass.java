// Anonymous class 
// if we want to use a class only once in our whole code then we can use concept of Anonymous class, in which we does not have to create a class also not have to make its objects just by declaring and calling we can use it.


interface A{
    void f1();
}
class AnonymousClass{
    public static void main(String[] args) {
        new A(){
            public void f1(){
                System.out.println("hello world");
            }
        }.f1();
    }
}