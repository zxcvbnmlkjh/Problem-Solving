/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * https://www.youtube.com/watch?v=HxnSEWzBeKI
 *
 * This matrix is in increasing order so the trick is consider it as a normal array
 */
public class Search2DMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 16;
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        System.out.print("Target Value exists " + search2DMatrix.searchMatrix(matrix, target));
    }
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int start = 0;
        int end = rowCount*colCount-1;
        while(start<=end) {

            int mid = (start+end)/2;
            if(matrix[mid/colCount][mid%colCount] == target) {
                return true;
            }
            if(matrix[mid/colCount][mid%colCount] > target) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
