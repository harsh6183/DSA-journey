class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start =1;
        int end = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]>end){
                end = nums[i];
            }
        }
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isDivisonPossible(nums,mid,threshold)){
                result=mid;
                end=mid-1;
            }else{
                start = mid+1;
            }
        } return result;
    }
        
    

        boolean isDivisonPossible(int[] nums, int divisor,int threshold){
            int sumOfDivison=0;
            for(int i=0; i<nums.length; i++){
                sumOfDivison += nums[i]/divisor;
                if(nums[i]%divisor!=0){
                    sumOfDivison+=1;
                }
                if(sumOfDivison>threshold){
                    return false;
                }
            }
            return true;
        }     
}
