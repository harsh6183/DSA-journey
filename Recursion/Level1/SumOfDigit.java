//Take the input n number and sum that digit number using recursion

import java.util.Scanner;

public class SumOfDigit{
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = sum(n);
        System.out.println(ans);

    }

    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        return (n) + sum(n-1);
    }
}