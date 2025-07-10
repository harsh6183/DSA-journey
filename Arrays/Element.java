//Take the input as n then take input that n numbers.Ask for the number user want and return the number index as a output.

import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i =0; i <arr.length; i++){
             arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int index= -1;

        for(int i = 0; i<arr.length ; i++){

            if(arr[i]==data){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
