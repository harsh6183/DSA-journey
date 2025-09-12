//Leetcode 941. Valid Mountain Array
//Example 1:

// Input: arr = [2,1]
// Output: false
// Example 2:

// Input: arr = [3,5,5]
// Output: false
// Example 3:

// Input: arr = [0,3,2,1]
// Output: true

public class BitonicArray{
    
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        int n = arr.length;

        //for increasing order
        while(index<n-1){
            if(arr[index]< arr[index+1]){
                index++;
            }else{
                break;
            }
        }

        if(index==0 || index==n-1){
            return false;
        }

         //for decreasing order
        while(index<n-1){
            if(arr[index]> arr[index+1]){
                index++;
            }else {
                break;
            }
        }
        return (index ==n-1);
    }
}
