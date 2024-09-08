import java.util.Scanner;

public class Shradha_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        //input
        //rows
        for(int i=0; i<rows; i++){
            //cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

 */

        //finding the value of x
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

         int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i + ", " + j +")");
                }
            }
        }

    }
}