/*
 There are four types of access modifier for methods. 
 private 
    It can only be available to access in its class only
 Default
    It can be accessed anywhere in it same package
 Protected
    It can be accessed anywehre in the same or different package but cannot be accessed when we create an object in other package of the class
 public 
    It can also be accessed anywhere in the same or different package.
 There are only two types of access modifier for class
 public
    which is default and is not needed to write while declaring the class
    It can be access anywhere within same or different package
 Private
    It is needed to be write while declaring the class.
    private class can only be access within a same package
 */


 class AccessModifiersDemo {
    // Public variable
    public int publicVariable = 10;

    // Private variable
    private int privateVariable = 20;

    // Protected variable
    protected int protectedVariable = 30;

    // Default variable (no access modifier)
    int defaultVariable = 40;

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
        // Can access all variables
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
        // Can access all variables
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
        // Can access all variables
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }

    // Default method (no access modifier)
    void defaultMethod() {
        System.out.println("Default method");
        // Can access all variables
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }
}

class AccessModifier {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing public members
        System.out.println(obj.publicVariable);
        obj.publicMethod();

        // Cannot access private members directly
        // System.out.println(obj.privateVariable); // Error
        // obj.privateMethod(); // Error

        // Can access protected members from a subclass
        // (assuming AnotherClass is in the same package)
        // System.out.println(obj.protectedVariable); // Error
        // obj.protectedMethod(); // Error

        // Can access default members from the same package
        // System.out.println(obj.defaultVariable); // Error
        // obj.defaultMethod(); // Error
    }
}