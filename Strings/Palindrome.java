import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
        palindromeCheck(s);
    }

    public static boolean isPalindrome (String check) {
        int i = 0;
        int j = check.length() -1;
        while(i<=j){
            char ch1 = check.charAt(i);
            char ch2 = check.charAt(j);
            
            if(ch1!=ch2){
                return false;
            }
                i++;
                j--;
            
        }
         return true;

    }

    public static void palindromeCheck(String m) {
        for (int i = 0; i <m.length(); i++) {
            for (int j = i + 1; j <=m.length(); j++) {
                String str = m.substring(i, j);
                if (isPalindrome(str)) {
                    System.out.println(str);
                }

            }
        }
    }

}