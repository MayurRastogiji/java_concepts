// Anonymous Objects are those objects which are not needed to be declared and we only have to use them once.


class A{
    public void print(){
        System.out.println("hello");
    }
}
class AnonymousObject{
    public static void main(String[] args) {
        new A().print();                // Here we had made an Anonymous Object
    }
}