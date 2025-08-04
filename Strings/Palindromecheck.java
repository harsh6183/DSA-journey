//Find the given string is palindrome or not
//This is solved using two pointers approach
public class Palindromecheck {
    public static void main(String[] args) {
        String s = ("MOM");
        isPalindrome(s);
    }
    public static void isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }    
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));

            if (ch1 != ch2) {
                System.out.println("No palindrome");;
            }

            i++;
            j--;
        }

        System.out.println("String is Palindrome");;
    }
}
