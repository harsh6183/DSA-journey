//Leetcode 977 SquaresofSortedArray
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
