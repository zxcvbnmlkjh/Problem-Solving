/**
 * Transpose is changing row to column
 */
public class TransposeMatrix
{
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        transposeMatrix.transpose(matrix);
    }
    public void transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j = i + 1; j < matrix.length; j++){
                System.out.println("Value of i and j is:"+ i + " " + j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            printMatrixData(matrix);
        }

    }

    void printMatrixData(int[][] matrix) {
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
