 //leetcode 240. Search a 2D Matrix II   same as the problem no 74 but here the rows are sorted columns are sorted according the condition
 //Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//Output: true

public class FindKthEle2 {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int rows=matrix.length;
        int col=matrix[0].length;

        //Keeping the starting point
        int r=0;
        int c=col-1;
        while(r<rows && c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(target<matrix[r][c]){
                c=c-1;
            }else{
                r=r+1;
            }
        }
        return false;
    }
}
}
