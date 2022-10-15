import java.util.Scanner;

public class MatrixFromUser
{
    public static void main(String[] args) {
        MatrixFromUser matrixFromUser = new MatrixFromUser();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Row size");
        int n = sc.nextInt();
        System.out.println("Enter Column size");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter element of row" + i + "n column" + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        matrixFromUser.printMatrix(matrix);
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

