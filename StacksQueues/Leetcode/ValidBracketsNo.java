//Leetcode 921. Minimum Add to Make Parentheses Valid
/*Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3 */

package Leetcode;

import java.util.Stack;

public class ValidBracketsNo {
    class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch =='('){
                stack.push(ch);
            }else {
                if(stack.isEmpty() || stack.peek()==')'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        } 
        return stack.size();
    }
}
}
