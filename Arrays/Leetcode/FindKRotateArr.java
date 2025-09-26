//Leetcode 33. Search in Rotated Sorted Array
//Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
//TC here is O(logN)
public class FindKRotateArr {
    
  public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start <=end){
            int mid = start +(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            //left side sorted
            if(nums[start]<=nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end =mid-1;
                }else{
                    start = mid+1;
                }
            }
            else{//right side sorted
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return ans;
    }
}