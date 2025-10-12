//Leetcode 709 convert the string to lowercase

public class LowerCase {
    class Solution {
    public String toLowerCase(String s) {
      StringBuilder str = new StringBuilder();
      int n = s.length();
      for(int i=0; i<n;i++){
        char ans = s.charAt(i);
        if(ans>='A'&& ans<='Z'){
           ans = (char)(ans+32);
        }
        str.append(ans);
      }
      return str.toString();
    }
}
}
