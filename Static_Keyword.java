// Implementation of static Keyword
/* 
 * Static Keyword is use when we want to use same variable throughout storage of that variable will be alloted by just declaring it, no other memory will be allocated by making object 
 * In static methods we can only access static variables, if we try to access normal variable it will through error.
 * While we can access both static and normal variable in normal methods. 
 * But after making object of it we can use it easily. 
 * we can use static methods without making its object.
 
 */

class A {

    int i = 5;
    static int j = 5;
    String name = "";

    public static void hello(){
        System.out.println("Hello bro.");
    }

    public static void hello(A obj){                        //accepting object to get access of non-static or Instance variable. 
        System.out.println("Hello "+ obj.name);
    }
}

class Static_Keyword {

    public static void main(String[] args) {
        System.out.println("We can use static variable without making there object");
        System.out.println(A.j);
        A a1 = new A();
        a1.name = "mayur";
        A a2 = new A();
        System.out.println("Before increment");
        System.out.println(a1.i);
        System.out.println(A.j);
        System.out.println("After increment");
        System.out.println(++a1.i);
        System.out.println(++A.j);
        // It will give error
        // System.out.println(A.i);

        System.out.println(a2.i);
        System.out.println(A.j);
        A.hello();                  //Accessing static method directly without creating its object
        A.hello(a1);                //Passing object to the static method

    }
}
