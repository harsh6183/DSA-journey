//Leetcode 151. Reverse Words in a String
/*Input: s = "the sky is blue"
Output: "blue is sky the"*/

class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+"); //Use to remove white spaces and get add
        StringBuilder output = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            output.append(str[i]);
            if (i != 0) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}
