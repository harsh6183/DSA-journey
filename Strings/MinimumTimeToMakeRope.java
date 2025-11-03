//Leetcode 1578. Minimum Time to Make Rope Colorful

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int count =0;
        for(int i=0;i<colors.length();){
            int maxSum=0;
            int sum=0;
            char ch = colors.charAt(i);

            while(i<colors.length() && ch==colors.charAt(i)){
                maxSum=Math.max(maxSum,neededTime[i]);
                sum+=neededTime[i];
                i++;
            }
            count+=(sum-maxSum);
        }
        return count;
    }
}
