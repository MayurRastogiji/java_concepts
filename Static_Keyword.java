// Implementation of static Keyword
/* 
 * Static Keyword is use when we want to use same variable throughout stoarge of that variable will be alloted by just declaring it, no other memory will be allocated by making object 
 * We can only access static variables in static methods, if we try to access normal variable it will through error.
 * While we can access both static and normal variable in normal methods. 
 * But after making object of it we can use it easily. 
 
 */

class A {

    int i = 5;
    static int j = 5;
}

class Static_Keyword {

    public static void main(String[] args) {
        System.out.println("We can use static variable without making there object");
        System.out.println(A.j);
        A a1 = new A();
        A a2 = new A();
        System.out.println("Before increment");
        System.out.println(a1.i);
        System.out.println(a1.j);
        System.out.println("After increment");
        System.out.println(++a1.i);
        System.out.println(++a1.j);
        // It will give error
        // System.out.println(A.i);

        System.out.println(a2.i);
        System.out.println(a2.j);

    }
}
