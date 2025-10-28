// Leetcode 75.Sort colors
// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    public void swap(int[] nums,int i , int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int index=0;
        
        while(index<=end){
            if(nums[index]==0){   //For zero move forward the index
                swap(nums,start,index);
                index++;
                start++;
            }else if(nums[index]==2){  //For 2 dont move the index
                swap(nums,end,index);
                end--;
            }else{      //For 1 skip the index
                index++;
            }
        }
    }
}
