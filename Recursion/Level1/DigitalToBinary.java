//Take the input n and convert it to the Binary number usign the recursion solve the problem

import java.util.Scanner;

public class DigitalToBinary {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        binary(n);
    }
    public static void binary(int n){
        if(n==0){
            return;
        }
        binary(n/2);
        int res = n%2;
        System.out.print(res);
    }
}
