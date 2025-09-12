//leetcode hard 1095. Find in Mountain Array
// Example 1:
// Input: mountainArr = [1,2,3,4,5,3,1], target = 3
// Output: 2
// Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

// Example 2:
// Input: mountainArr = [0,1,2,4,2,1], target = 3
// Output: -1
// Explanation: 3 does not exist in the array, so we return -1.

//TC of this code is O(NlogN)

public class FindKthEle {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0;
        int end = n-1;
        int mid = -1;

        while(start<=end){
            mid = start + (end-start)/2;
            int cur= mountainArr.get(mid);

            if(mid!=0 && mid!=n-1 && cur>mountainArr.get(mid-1) && cur>mountainArr.get(mid+1)){
                if(cur==target){
                    return mid;
                }
                break;
            }
            else if(mid!=n-1 && cur <mountainArr.get(mid+1)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        //finding in first half(increasing half)
        start =0;
        end =mid-1;
        while(start<=end){
            int m= start+(end-start)/2;
            int cur = mountainArr.get(m);
            if(cur==target){
                return m;
            }else if(target<cur){
                end=m-1;
            }else{
                start=m+1;
            }
        }

        //finding in secon half(decreasing half)
        start =mid+1;
        end =n-1;
        while(start<=end){
            int m= start+(end-start)/2;
            int cur = mountainArr.get(m);
            if(cur==target){
                return m;
            }else if(target<cur){
                start=m+1;
            }else{
                 end=m-1;
            }
        }
        return -1;
    }
}
