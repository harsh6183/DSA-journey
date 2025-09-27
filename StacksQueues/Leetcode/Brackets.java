//Leetcode problem no 20. Valid Parentheses
/*Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true */

package Leetcode;

import java.util.Stack;

public class Brackets {
    class Solution {
    public boolean isValid(String s) {
        int n =  s.length();
        if(n%2!=0){
            return false;   //Stack is odd return false
        }

        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch=='{' || ch =='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                //top element
                char top = stack.peek();
                if(ch ==')' && top !='('){
                    return false;
                }else if(ch =='}' && top !='{'){
                    return false;
                }else if(ch ==']' && top !='['){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.size()==0);
    }
}
}
