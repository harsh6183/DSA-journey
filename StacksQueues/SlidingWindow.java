//Sliding window Maximum leetcode 239
//Input {1,3,4,2,6,9} k=3 Output ={4,4,9,9,9} 

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[]nums ={1,3,4,7,5,8,2,9};
        int k = 3;
        SlidingWindow ans = new SlidingWindow();
        int[] arr= ans.maxSlidingWindow(ans);
        System.out.println(Arrays.toString(arr));
    }
    public int[] maxSlidingWindow(int []nums,int k){
        int n = nums.length;
        int res[]=new int [n-k-1];
        if(n==0){
            int k = 0;
            return res;
        }
        return(nums);
    }
}
