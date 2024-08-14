/*
 * Operators
    Arithmatic
        Addition (+)
        Subtraction(-)
        Multiplication(*)
        Division(/)
        Modulous(%)
        Pre and Post Increment(++)
            Post increment first return the value and then add by 1
            Pre Increment first add by 1 then return the value
        Pre and Post Decrement(--)
            similar to Pre and Post Increment but inplace of add by 1 it subtract by 1
    Assignment
        Equal(=)
        Addition assignment (+=)
        Subtraction assignment (-=)
        Multiplication assignment (*=)
        Division assignmentv (/=)
        Remainder assignment (%=)
    Relational
        EqualsTo (==)
        Greater than (>)
        Greater than or Equals to (>=)
        Smaller Than(<)
        Smaller than or Equals to (<=)
        Not (!)
        Not Equals to (!=)
    Logical
        Logical And (&&)
        Logical Or (||)
    Bitwise
        Not gate (~)
        And gate (&)
        Or gate (|)
        XOR gate (^)
        Right shift (>>>)
        left shift (<<)
        Arithmatic right shift (>>)
*/
class A{
    public static void main(String[] args) {
        int i=5,j=3;
        System.out.println("Implementation of Arithmatic Operators");
        System.out.println("\t Addition Operator"+ (i+j));
        System.out.println("\t Subtraction Operator"+ (i-j));
        System.out.println("\t Multiplication Operator"+ (i*j));
        System.out.println("\t Division Operator"+ (i/j));
        System.out.println("\t Modulous Operator"+ (i%j));
        System.out.println("\t Pre increment Operator"+ (++i));
        System.out.println("\t Post Increment Operator"+ (i++));
        System.out.println("\t Post Decrement Operator"+ (i--));
        System.out.println("\t Pre Decrement Operator"+ (--i));

        System.out.println("\nImplementation of Assingment Operators");
        System.out.println("\t Addition Equal Operator"+ (i+=j));
        System.out.println("\t Subtraction Equal Operator"+ (i-=j));
        System.out.println("\t Multiplication Equal Operator"+ (i*=j));
        System.out.println("\t Division Equal Operator"+ (i/=j));
        System.out.println("\t Modulous Equal Operator"+ (i%=j));
        System.out.println("\t Equal Operator"+ (i=j));

        System.out.println("\nImplementation of Bitwise Operators");
        System.out.println("\t NOt Operator"+ (~i));
        System.out.println("\t And Operator"+ (i&j));
        System.out.println("\t Or Operator"+ (i|j));
        System.out.println("\t XOR Operator"+ (i^j));
        System.out.println("\t Right shift Operator"+ (i>>>2));
        System.out.println("\t Arithmatic Right shoft Operator"+ (i>>2));
        System.out.println("\t Left shift Operator"+ (i<<2));
        
        if(i==j){

            System.out.println("\n Equal Operators");
        }
        if(i>j){

            System.out.println("\n Greater Operators");
        }
        if(i>=j){

            System.out.println("\n Greter than or Equal Operators");
        }
        if(i<j){

            System.out.println("\n Smaller than Operators");
        }
        if(i<=j){

            System.out.println("\n Smaller than or Equal to Operators");
        }
        if(i!=j){

            System.out.println("\n Not Equal to Operators");
        }
        if(i == j && j ==5){

            System.out.println("\n And Operators");
        }
        if(i==j || j ==3){

            System.out.println("\n Or Operators");
        }
        

    }
}