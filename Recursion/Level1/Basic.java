//Take the input n and print n times the name;git 

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
       
    }

    public static void printIncreasing(int n){
         String name = "Harsh";
        if (n ==0){
            return;
        }

        printIncreasing(n-1);
        System.out.println(name);
    }
}
