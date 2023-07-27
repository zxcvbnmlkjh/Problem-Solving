public class MatrixIntitialisation
{
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4,9}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        MatrixIntitialisation matrixIntitialisation = new MatrixIntitialisation();
        matrixIntitialisation.printMatrixData(matrix);
    }

    void printMatrixData(int[][] matrix) {
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length; j++){
                System.out.println("Size"+ matrix[i].length);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }


}
