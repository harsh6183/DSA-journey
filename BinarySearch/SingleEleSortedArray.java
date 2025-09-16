//leetcode 540. Single Element in a Sorted Array
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

public class SingleEleSortedArray {
    class Solution {
    public int singleNonDuplicate(int[] nums) {
      int start=0;
      int end = nums.length-2;

      while(start <= end){
        int mid = start +(end-start)/2;
        if(nums[mid]==nums[mid^1]){  //This is comparing with the XOR
            start = mid+1;
        }else{
            end=mid-1;
        }
      } 
      return nums[start];
    }
}
}
