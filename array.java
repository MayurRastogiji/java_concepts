import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++){
            System.out.println("Enter Value of arr[" + i + "]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Values of array are :");
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        // Multi-Dimensional Array or Jagged array or arraya of array
        System.out.println("Enter number of array");
        int X_len = sc.nextInt();
        int[][] arr_m = new int[X_len][];
        for (int i = 0; i< X_len; i++){
            System.out.println("Enter length of arr_m[" + i + "] array");
            int y_len = sc.nextInt();
            arr_m[i] = new int[y_len];
        } 
        for(int i=0;i <X_len; i++){
            for(int j =0;j<arr_m[i].length;j++){
                System.out.println("Enter value of arr_m[" + i + "][" + j + "]" );
                arr_m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Values of array are :");
        for(int i=0;i <X_len; i++){
            for(int j =0;j<arr_m[i].length;j++){
                System.out.print(arr_m[i][j]);
                System.out.print(" ");       
            }
            System.out.println();
        }

    }
}