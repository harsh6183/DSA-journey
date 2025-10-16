//Leetcode 217 Contains of Duplicate
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

import java.util.HashSet;

public class ContainsOfDuplicate {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length;i++){
           if(set.contains(nums[i])){
            return true;
           }
           set.add(nums[i]);
        }
        return false;
    }
}
}
