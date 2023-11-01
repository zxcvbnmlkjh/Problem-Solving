import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * We need to have 2 separate loops one for calculating left diagonal
 * One for calculating the right diagonal.
 */
public class MatrixSumDiagonal
{
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        MatrixSumDiagonal sum = new MatrixSumDiagonal();
        System.out.println(sum.getSum(mat));

    }
    public int getSum (int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int i =0;
        int j = 0;
        int sum = 0;
        int p = col-1;
        int q = 0;
        while(i<row && j<col) {
            sum = sum + mat[i][j];
            i++;
            j++;
        }

        while(p>=0 && q<col) {
            sum = sum + mat[p][q];
            p--;
            q++;
        }
        return sum;
    }
}
