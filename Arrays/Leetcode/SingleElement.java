package Leetcode;
//Leetcode 136 Find the Single Element present in the Array

public class SingleElement {class Solution {
    public int singleNumber(int[] nums) {
        int single = nums[0];

        for(int i =1;i<nums.length;i++){
            single = single ^ nums[i];
        }
        return single;
    }
}}