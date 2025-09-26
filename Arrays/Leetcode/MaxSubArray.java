//Leetcode 53 Find maximum subarray

/*Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23. */

package Leetcode;
      
//Kadanes Algorithm

public class MaxSubArray {
    class Solution {
    public int maxSubArray(int[] nums) {
        //To find maximum
        int max = nums[0];
        //To store we can use this
        int current_max = nums[0];

        for(int i =1; i<nums.length;i++){
            //stores the maximum of the array we traverse
            current_max = Math.max(nums[i],nums[i]+current_max);

            //Checks and return the maximum of both
            max = Math.max(current_max,max);
        }

        return max;
    }
}
}

//Time complexity is O{N} SC is O{1}
