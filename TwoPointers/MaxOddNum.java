//Leetcode 2864. Maximum Odd Binary Number
/*Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001". */

package TwoPointers;

public class MaxOddNum {
    class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int left= 0;
        int right=n-1;

        char[] arr= s.toCharArray();
        while(left<=right){
            if(arr[left]=='1'){
                left++;
            }
            if(arr[right]=='0'){
                right--;
            }

            if(left<right && arr[left]=='0' && arr[right]=='1'){
                arr[left]='1';
                arr[right]='0';
            }
        }

        arr[right]='0';
        arr[n-1]='1';

        return new String(arr);
    }
}
}
