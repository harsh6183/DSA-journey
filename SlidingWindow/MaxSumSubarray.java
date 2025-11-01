// 2461. Maximum Sum of Distinct Subarrays With Length K
/*Example 1:

Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.*/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set <Integer> set = new HashSet<>();
         long curSum =0;
        long maxSum=0;
        int left =0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);
                curSum-=nums[left];
                left++;
            }
            curSum+=nums[right];
            set.add(nums[right]);
            if(set.size()==k){
                maxSum=Math.max(curSum,maxSum);
            }
        }
        return maxSum;
    }
}
