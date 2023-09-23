import java.util.ArrayList;

public class Solution1 {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> result = new ArrayList<String>();
        if(helper(0,0,m,n,"",result)){
            return result;
        }else{
            result.add("-1");
            return result;
        }
    }
    public static boolean isvalid(int i, int j, int mat[][], int n){
        if(i>=0 && i<n && j>=0 && j<n && mat[i][j]==1){
            return true;
        }
        return false;
    }
    public static boolean helper(int i, int j, int mat[][], int n, String sb, ArrayList<String> res){

        if(i==n-1 && j==n-1 && mat[i][j]==1){
            // System.out.print(sb);
            res.add(sb);
            return true;
        }

        if(isvalid(i,j,mat,n) == true){

            mat[i][j] = 0;

            if(helper(i+1, j, mat, n,sb + "D", res) == true){
                return true;
            }
            if(helper(i-1, j, mat, n,sb + "U", res) == true){
                return true;
            }
            if(helper(i, j+1, mat, n,sb + "R", res) == true){
                return true;
            }
            if(helper(i, j-1, mat, n,sb + "L", res) == true){
                return true;
            }
            mat[i][j] = 1;
            return false;
        }
        return false;
    }
}
