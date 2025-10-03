//leetcode 1684  Count the Number of Consistent Strings
/*Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent. */

import java.util.HashSet;

//Time complexity here is O(1) because of the Hashing Algorithm
public class NoOfConsistentStrings {
    class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }

        for(String str:words){
            boolean flag = true;
            for(int i=0; i<str.length();i++){
                if(!set.contains(str.charAt(i))){
                    flag=false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
}
