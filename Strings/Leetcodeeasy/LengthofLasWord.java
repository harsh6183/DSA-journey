//Leetcode  58. Length of Last Word
/*Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.*/

class Solution {
    public int lengthOfLastWord(String s) {
        String[] word= s.split(" ");
        String lastWord = word[word.length-1];
        int length = lastWord.length();
        return length;
        
    }
}
