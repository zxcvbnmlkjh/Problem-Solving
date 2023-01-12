/**
 * Delete Greatest Value in Each Row
 * https://leetcode.com/problems/delete-greatest-value-in-each-row/description/
 *
 */

import java.util.Arrays;

public class DeleteGreatestValue
{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,4}, {3, 3, 1}};
        DeleteGreatestValue deleteGreatestValue = new DeleteGreatestValue();
        deleteGreatestValue.printMatrix(matrix);
        System.out.print(deleteGreatestValue.deleteElement(matrix));
    }

    public int deleteElement(int[][] matrix)
    {
        int p = 0;
        while(p < matrix.length) {
            Arrays.sort(matrix[p]);
            p++;
        }
        int sum = 0;
        int max = 0;
        for(int i= 0; i<matrix[0].length; i++) {

            for(int[] row : matrix) {
                max = Math.max(row[i], max);
            }
            sum = sum+max;
        }
        return sum;
    }

    public void printMatrix (int[][] matrix)
    {
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    }

