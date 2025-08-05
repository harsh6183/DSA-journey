//Take the input n rows and k col and print the array of the n and k in matrix form.


import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); //Rows
        int k=scn.nextInt(); //Columns

        //Input for the 2D array
        int [][] arr = new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0; j<k;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //Printing the 2D array
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }  
    }
    
}
