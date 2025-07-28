// Compress the String and Give the output
// Input is => aabbccddee Output =>a2b2c2d2e2

import java.util.Scanner;

public class Compression2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
    }

    public static String compression1(String str) {
        String s = str.substring(0, 1);

        for (int i =1 ; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current != previous) {
                s+= current;
            }
        }
        return s;
    }

    public static String compression2(String str){
        String s = str.substring(0, 1);
        int count =1;

        for (int i =1 ; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current == previous) {
                count++;
            }else{
                if(count >1){
                    s+=count;
                    count =1;
                }
                s+=current;
            }
        }
        if(count >1){
                    s+=count;
                    count =1;
                }
               
        return s;
    }
}