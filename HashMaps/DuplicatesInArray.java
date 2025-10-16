//Leetcode 442 Find all the Duplicates and return the list
//Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicatesInArray {
    class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int i = 0 ; i<nums.length;i++){
            if(set.contains(nums[i])){
               duplicates.add(nums[i]);
            }else{
                set.add(nums[i]);
            } 
        }
        return duplicates;
    }
}
}
