//Leetcode 209. Minimum Size Subarray Sum

/*Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.*/

public class MinSizeWindow {
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow=Integer.MAX_VALUE;
        int currentSum=0;

        //Solving using Two pointers;
        int high=0;
        int low=0;
        while(high<nums.length){
            currentSum+=nums[high]; //finding the currentSum and increase the Window size
            high++;
      

        //Try to srink or reduce the size of the window
        while(currentSum>=target){
            int currentWindowSize=high-low;

            minLenWindow=Math.min(minLenWindow,currentWindowSize);
            currentSum-=nums[low];
            low++;
            }
        }
        return minLenWindow==Integer.MAX_VALUE?0:minLenWindow;
    }
}
}
