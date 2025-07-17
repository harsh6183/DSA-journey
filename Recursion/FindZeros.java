//Take input as a number and find the number of zeros present in the number

import java.util.Scanner;

public class FindZeros {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        char[] arr = input.toCharArray();
        int zeroCount = countZeros(arr,0);
        System.out.println(zeroCount);

    }

    public static int countZeros(char[] arr , int index){
        if(index==arr.length){
            return 0;
        }

        int count = arr[index]=='0'? 1:0;

        return count + countZeros(arr, index+1);
    }
}
