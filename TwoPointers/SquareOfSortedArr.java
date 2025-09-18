// Leetcode 977. Squares of a Sorted Array
/*Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */
package TwoPointers;

public class SquareOfSortedArr {
   class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] =new int [n];
        int left= 0;
        int right = n-1;

        int resIndex=n-1;
        while(left<=right){
            int sqL= nums[left]*nums[left];
            int sqR = nums[right]* nums[right];
            if(sqL>=sqR){
                res[resIndex]=sqL;
                left++;
            }else{
                res[resIndex]=sqR;
                right--;
            }
            resIndex--;
        }
        return res;
    }
}
}
