//A bar chart of asteriks(*) representing the value of the array a
/*
 suppose input 5 
 array of 5 input is 
 3
 1
 0
 2
 5
 Output will be:
        *
        *
 *      *
 *    * *
 * *  * *
 
 */

import java.util.Scanner;

public class Barchart { public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i =0; i <arr.length; i++){
             arr[i] = scn.nextInt();
        }

        int max= arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    
}
