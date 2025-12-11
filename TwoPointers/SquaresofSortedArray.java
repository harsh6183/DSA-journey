//Leetcode 977 SquaresofSortedArray
/*Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/
class Solution {
    public int[] sortedSquares(int[] nums) {
       int left =0;
       int right= nums.length-1;
       int[] res=new int[nums.length];
       int i=nums.length-1;

       while(left<=right){
        if(Math.abs(nums[left])>Math.abs(nums[right])){
            res[i]=nums[left]*nums[left];
            left++;
        }else{
            res[i]=nums[right]*nums[right];
            right--;
        }
        i--;
       }
       return res;
    }
}
