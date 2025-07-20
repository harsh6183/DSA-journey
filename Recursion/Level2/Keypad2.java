//Approach 2 for the keypad combinations

public class Keypad2{

    static String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args) {
        String input = "23";
        System.out.println("Combinations for " + input + ":");
        getCombinations("", input);
    }

    // Recursive method
    public static void getCombinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];

        for (int i = 0; i < letters.length(); i++) {
            getCombinations(p + letters.charAt(i), up.substring(1));
        }
    }
}
