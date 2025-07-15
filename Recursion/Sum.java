//Take the input n and print the sum of first n numbers

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    }

    public static void addition(int n){
        for(int i =0;i<n-2;i++){
            int sum = i + n;
            System.out.println(sum);
        }
    }
}

