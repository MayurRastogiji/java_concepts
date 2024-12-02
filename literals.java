// in this file we will learn about literals 

class literals{

    public static void main(String[] args) {
        int a = 56;                 //normal integer
        int b = 0b101;              //binary number
        int c = 0x8e;               //hexadecimal number
        double d = 12e10;           //Exponential number
        long e = 10_00_000;         //using underscore to count zeros easily
        char f = 'a';               //characters
        f++;                        //we can perform increment function on characters
        double g = 58;              //if we assing int to double , it will type cast to double automatically
        float h = 12.5f;            //by default decimal values are double, we had to put f at last to convert them into float

        // printing all above mentioned data
        System.out.println(a+ " " + b+ " " + c + " " + d + " " + e + " " + f + " "+ g + " " + h);
    }
}