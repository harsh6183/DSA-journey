//Leetcode 1317. Convert Integer to the Sum of Two No-Zero Integers
//Input: n = 2 or suppose n =11
// Output: [1,1] or [2,9]
// Explanation: Let a = 1 and b = 1.  Let a =2 and b= 9. Since the number should be nonzero

package Basics.MainJava;

public class ConvertInteger {
    
    public int[] getNoZeroIntegers(int n) {
        int a = 0;
        int b = 0;

        for (int i = 1; i < n; i++) {
            a = i;
            b = n - i;
            if (!containsZero(a) && !containsZero(b)) {
                break;
            }
        }
        int[] arr = {a, b};
        return arr;
    }

    private boolean containsZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true; 
            }
            num /= 10;
        }
        return false;
    }
}

