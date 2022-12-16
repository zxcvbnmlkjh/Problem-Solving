import java.util.Scanner;

public class Graph_Matrix_Representation
{
    public static void main(String[] args)
    {
        Graph_Matrix_Representation matrix = new Graph_Matrix_Representation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of cols");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j< c; j++)
            {
                arr[i][j] = 0;
            }
        }

        matrix.addEdge(arr, 0, 1);
        matrix.addEdge(arr, 1, 2);
        matrix.addEdge(arr, 2, 3);
        matrix.addEdge(arr, 3, 4);
        matrix.addEdge(arr, 0, 4);
        matrix.addEdge(arr, 4, 1);
        matrix.addEdge(arr, 1, 3);
        matrix.printMatrix(arr);
    }
    public void addEdge(int[][] arr, int i, int j) {
        arr[i][j] = 1;
        arr[j][i] = 1;
    }

    public void printMatrix(int[][] arr) {
        System.out.println("Array length is:"+ arr.length);
        for(int i=0; i<arr.length; i++) {
            for(int j=0 ;j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
