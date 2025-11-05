
//Leetcode 1528 Shuffle String
class Solution {
    public String restoreString(String s, int[] indices) {
        if(s.length()==0 || s==null){
            return "";
        }
        if(s.length()!=indices.length){
            return "";
        }

       char[] result = new char[s.length()];
        for(int i=0;i< indices.length; i++){
           result[indices[i]]=s.charAt(i); 

        }
        return new String (result);
    }
}
