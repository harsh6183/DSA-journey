//Leetcode 69. Sqrt(x)
/*Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.*/

public class FindSquare {
    class Solution {
    public int mySqrt(int x) {
        int start =1;
        int end =x;
        while(start <=end){
            int mid = start +(end-start)/2;
            if(mid<=x/mid){
                if(x%mid==0 && mid ==x/mid){
                    return mid;
                }
                start = mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }
}
}
