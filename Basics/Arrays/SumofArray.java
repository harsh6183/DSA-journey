//Take input n1 and n2 which is size of array then take the input n1 numbers and n2 numbers. Finlly print the sum of 2 arrays of n1 and n2.

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1= scn.nextInt();
        int[] arr= new int[num1];
        for(int i=0; i<arr.length;i++){
              arr[i] = scn.nextInt();
        }
    }
}
