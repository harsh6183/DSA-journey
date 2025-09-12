//Leetcode 852. Peak Index in a Mountain Array
// Example 1:
// Input: arr = [0,1,0]
// Output: 1

// Example 2:
// Input: arr = [0,2,1,0]
// Output: 1

// Example 3:
// Input: arr = [0,10,5,2]
// Output: 1

//TC of this code is O(log N) which is more optimal solution
public class PeakIndexMA{
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
     

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid!=n-1 && arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}

//This code was successfull run but TC was O(N) 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid!=n-1){
                for(int i=0; i<arr[mid];i++){
                    if(i>arr[mid]){
                        return i;
                    }
                }
            }else if(arr[mid]<arr[mid+1]){
                    for(int i=arr[mid]; i<arr[mid-1];i++){
                    if(i>arr[mid]){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}