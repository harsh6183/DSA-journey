// leetcode medium 74. Search a 2D Matrix

//Time complexity is O (log n * m)

public class FindKthinMatrix {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false ;
        }

        int rows = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = rows*col-1;;

        while(start<=end){
            int mid = start + (end-start)/2;
            int r=mid/col;
            int c= mid%col;
            int val=matrix[r][c];

            if(val==target){
                return true;
            }else if(target<val){
                end = mid-1;
            }else if(target>val){
                start=mid+1;
            }
        }
        return false;
    }
}
}
