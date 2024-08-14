// In this file we will study about different types of data types and Type casting;

/*
*int 
    used to store integer
    range = -127 : 128
    size = 4 bytes
*double
    every double precision floating value is default double
    size = 8 bytes
*char 
    it is used to store unicode character 
    by default it uses '' to store data
    size = 2 bytes
*String
    it is used to store String
    by default it uses "" to store data
*float
    it is used to store single precision floating value
    to store in float we need to use f keyword after the numeric value
    size = 4 bytes
*long
    it is used to store large numeric data
    range = -2^63 : 2^63-1
    size = 8 bytes
    to store in long keyword we need to use l keyword 
*/
/*
  Type casting
    there are two types of type casting 
    implicit type casting
        when we assing smaller size data type to larger size data type
        it is done automatically
    Explicit type casting
        when we want to assing larger data type to smaller size data type
        it is done manually by using (_data type_) before variable
 
 */
class A{
    public static void main(String[] args){
        System.out.println("Hello World");
        int a = 10;                         
        double b = 10.5;
        char c = 'A';
        String d = "Hello";
        float e = 10.05f;
        long f = 10l;
        System.out.println("Values of b,e before type casting");
        System.out.println(b);
        System.out.println(e);
        e = (float)b;                   //Explicit type casting
        System.out.println("Values of b,e After Explicit type casting");
        System.out.println(b);
        System.out.println(e);
        b = a;                          //Implicit Type Casting
        System.out.println("Values of b,a After Implicit type casting");
        System.out.println(b);
        System.out.println(a);

    }
}