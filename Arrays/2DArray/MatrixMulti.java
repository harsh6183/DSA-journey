//Multiply matrix and print the matrix and if the column of 1st matrix and row of 2nd matrix is not equall then print invalid input
//input r1=2 c1=3 , r2=3 c2=4 output matrix of= r1=2,c2=4

import java.util.Scanner;
public class MatrixMulti {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter Matrix1 no of row and col= ");
        int r1 = scn.nextInt(); 
        int c1=scn.nextInt(); 

         System.out.println("Fill the Matrix1  row*col= ");
        int [][] one = new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j=0; j<one[0].length;j++){
                one[i][j]=scn.nextInt();
            }
        }

        System.out.println("Enter Matrix2 no of row and col= ");
        int r2 = scn.nextInt(); 
        int c2=scn.nextInt(); 

        System.out.println("Fill the Matrix2  row*col= ");
        int [][] two = new int[r2][c2];
        for(int i=0;i<two.length;i++){
            for(int j=0; j<two[0].length;j++){
                two[i][j]=scn.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid input");
        }

        //Printing the required r1c2 matrix

        int [][] product =new int [r1][c2];
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                for(int k=0;k<c1;k++){
                    product[i][j] += one[i][k] * two[k][j];
                 }
            }
        }
        System.out.println("Result => ");
         for(int i=0;i<product.length;i++){
            for(int j=0; j<product[0].length;j++){
              System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}
