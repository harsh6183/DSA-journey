//Leetcode 3541. Find Most Frequent Vowel and Consonant
// Example 1:

// Input: s = "successes"
// Output: 6
// Explanation:
// The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
// The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
// The output is 2 + 4 = 6.

import java.util.HashSet;
import java.util.Set;

public class FindMaxFreq {
    class Solution {
    public int maxFreqSum(String s) {
        int[] hash = new int [26];
        for(char ch:s.toCharArray()){
            hash[ch-'a']++;
        } 

        Set <Integer> set = new HashSet<>();
        set.add('a'-97);
        set.add('e'-97);
        set.add('i'-97);
        set.add('o'-97);
        set.add('u'-97);

        int maxV =0;
        int maxC =0;

        for(int i =0; i<26; i++){
            if(set.contains(i)){
                maxV=Math.max(maxV,hash[i]);
            }else{
                maxC=Math.max(maxC,hash[i]);

            }
        }
        return maxV + maxC;
    }
}
}

//Faster solution 
class Solution {
    public int maxFreqSum(String s) {
        s=s.toLowerCase();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        int vmax=0;
        int cmax=0;
        for(int i=0;i<arr.length;i++){
            
            if((i==0||i==4||i==8||i==14||i==20)&&arr[i]>vmax){
                vmax=arr[i];
            }
            else if((i!=0&&i!=4&&i!=8&&i!=14&&i!=20)&&arr[i]>cmax){
                cmax=arr[i];
            }
        }
        return vmax+cmax;
    }
}
