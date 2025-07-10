//Taking input n no of array and return back the largest element from the array.


import java.util.Scanner;

public class LargetElement {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
              int max= arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         System.out.println(max);

    }
}


//Time complexity =O(n) and space = O(n)