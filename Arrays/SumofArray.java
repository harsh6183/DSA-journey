//Take input n1 and n2 which is size of array then take the input n1 numbers and n2 numbers. Finlly print the sum of 2 arrays of n1 and n2.

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1= scn.nextInt();
        int[] arr1= new int[num1];
        for(int i=0; i<arr1.length;i++){
              arr1[i] = scn.nextInt();
        }

       int num2= scn.nextInt();
        int[] arr2= new int[num2];
        for(int i=0; i<arr2.length;i++){
              arr2[i] = scn.nextInt();
        }

        int[] sum = new int [num1>num2? num1:num2];
        int carry = 0;
        
        int i =arr1.length -1;
        int j = arr2.length -1;
        int k = sum.length -1;

        while(k>=0){
            int digit =carry;
            if ( i>=0){
                digit +=arr1[i];
            }

            if(j>=0){
                digit+=arr2[j];
            }

            carry = digit/10;
            digit = digit%10;
            sum[k]=digit;

            i--;
            j--;
            k--;
        }

        if(carry >0){
            System.out.println(carry);
        }
        for(int val:sum){
            System.out.println(val);
        }
    }
}
