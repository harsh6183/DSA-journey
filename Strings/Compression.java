// Compress the String and Give the output
// Input is => aabbccddee Output =>abcde

import java.util.Scanner;

public class Compression {
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
}