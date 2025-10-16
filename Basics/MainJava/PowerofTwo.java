//Leetcode 231 Power of two
class Solution {
    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while(i<n){
            i=i*2;  //i=2,4,8,16
        }

        return i==n?true:false;
    }
}