/*
 * Record class is mainly used to store data, and retrive it used less numebr of code.
 */


 record greet(String name) {
     public greet(String name) {
        this.name = name;
         System.out.println("mochi mochi " + name);
     }
 }

 class RecordClass{
    public static void main(String[] args) {
        var a = new greet("mayur");
        System.out.println(a);
    }
 }