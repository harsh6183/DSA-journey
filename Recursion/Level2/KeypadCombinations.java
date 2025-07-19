//Print the keypad combinations 

import java.util.*;

public class KeypadCombinations {

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
        List<String> combinations = getCombinations("", input);
        System.out.println("Combinations for " + input + ": " + combinations);
    }

    public static List<String> getCombinations(String p, String up) {
        // Base case
        if (up.isEmpty()) {
            List<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }

        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];

        List<String> result = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            List<String> subList = getCombinations(p + letters.charAt(i), up.substring(1));
            result.addAll(subList);  // collect all results
        }

        return result;
    }
}
