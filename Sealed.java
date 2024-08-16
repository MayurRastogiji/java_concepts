// there are three types of constraints
//     sealed 
//     non-sealed 
//     final



sealed class A permits Sealed {
    public void f1() {
        System.out.println("in Class A");
    }
}

final class Sealed extends A {
    public static void main(String[] args) {
        new Sealed().f1();
    }
}