//Get the sum of the target value and print the index in the array formate
//arr={2,3,4} Target =7, Ouput=[3,4]

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }

    public static int[] twoSum(int[] nums,int target ){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int reqNumber = target-nums[i];

            if(hm.containsKey(reqNumber)){
                int [] arr={hm.get(reqNumber),i};
                return arr;
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}
