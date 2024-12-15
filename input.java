import java.util.Scanner;

//Latest way to take input from user after version 1.5

class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("Your number is " + n);
    }
}

// way to take an input before java version 1.5

/* 
class input{
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        System.err.println("Enter a number");
        int num = 0;
        try{
            num = Integer.parseInt(bf.readLine());
        }
        catch(IOException e){
            System.err.println(e);
        }
        System.err.println(num);

    }
}
*/