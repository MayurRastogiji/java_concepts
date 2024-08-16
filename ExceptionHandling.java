/*
Exception handling is the process via which we can find out the exception that can occur in the code using try block and able to handle it using catch, finally, throw, throws
 */
class ExceptionHandling{
    public static void divide(int a,int b) throws Exception{
        if (b == 0){
            throw new Exception("Division by zero is not possible in int datatype.");
        }else{
            System.out.println("Answer is : " + (a/b));
        }
    }
    public static void main(String[] args) {
        int z;
        try{
            z = 10/0;
            System.out.println(z);
        }
        catch(Exception e){
            System.out.println("Exception is :" + e);
        }
        finally{
            System.out.println("Inside finally block");
        }
        try {
            divide(5,0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}