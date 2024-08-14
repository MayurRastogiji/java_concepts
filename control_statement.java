/*
CONTROL STATEMENTS
    If
    if-else
    else-if ladder
    switch case
    for loop
    while loop
    do while loop
    break keyword
    continue keyword
 */


class A{
    public static void main(String[] args) {
        int i =5;

        // Implementation of if , if-else, else-if ladder

        if (i < 5){
            System.out.println("small");

        }
        else if(i > 5){
            System.out.println("greater");
        }
        else{
            System.err.println("equal");
        }

        // Implementation of for, while, DO-while Loops and continue statement

        for (int k = 0;k<100; k++){
            if (k%2 == 0){
                System.out.println(k + " : Even");
            }
            else if(i%5 == 0){
                continue;
                }
            else{
                System.out.println(k + " : Odd");
            }
        }
        
        int j = 1;
        while (j<10) { 
            System.out.println(j + " Inside while loop");
            j++;
        }

        int m = 1;
        do{
            System.out.println(m + " Inside do while loop");
            m++;
        }while(m<10);
        

        // Implementation of switch case and break statement
        int n = 4;
        switch (n) {
            case 0:
                System.out.println("n == 0");
                break;
            case 1:
                System.err.println("n == 1");
                break;
            default:
                System.err.println("n is neither 0 nor 1");
        }
    }
}