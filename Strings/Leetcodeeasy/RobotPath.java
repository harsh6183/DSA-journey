//Leetcode 657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int left=0;
        int up=0;
        char[] arr= moves.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            switch(arr[i]){
                case 'U':
                up++;
                break;
                case'D':
                up--;
                break;
                case'L':
                left++;
                break;
                case'R':
                left--;
            }    
        }
        return up==0 && left==0;
    }
}
