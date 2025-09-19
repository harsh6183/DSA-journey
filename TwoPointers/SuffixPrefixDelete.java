//Leetcode 1750 Minimum Length of String After Deleting Similar Ends
/*Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "". */
public class SuffixPrefixDelete{
class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int prefix=0;
        int suffix=n-1;

        while(prefix<suffix && s.charAt(prefix)== s.charAt(suffix)){
            char ch = s.charAt(prefix);
            //Deleting prefix
            while(prefix<=suffix && s.charAt(prefix)==ch){
                prefix++;
            }

            //Deleting suffix
            while(prefix<=suffix && s.charAt(suffix)==ch){
                suffix--;
            }
        }
        return (suffix-prefix+1);
    }
}
}