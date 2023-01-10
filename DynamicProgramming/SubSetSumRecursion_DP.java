public class SubSetSumRecursion_DP
{
    public static void main(String[] args) {
        int[] arr = {2,3,5,1};
        int Sum = 7;
        boolean[][] dp = new boolean[arr.length+1][Sum+1];
        for(int i= 1; i<=Sum;i++) {
            dp[0][i] = false;
        }
        for(int i=0; i<=arr.length;i++) {
            dp[i][0] = true;
        }

        SubSetSumRecursion_DP subSetSumRecursion = new SubSetSumRecursion_DP();
        subSetSumRecursion.printMatrix(dp);
        System.out.print("Subset sum exists: " + subSetSumRecursion.checkSubSetSum(arr, arr.length, Sum, dp));
    }

    public void printMatrix(boolean[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0 ;j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public boolean checkSubSetSum (int[] arr, int n, int sum, boolean[][] dp)
    {
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }



        if(arr[n-1]>sum) {
            dp[n][sum] = checkSubSetSum(arr, n-1, sum, dp);
            return dp[n][sum];
        } else {
            dp[n][sum] =checkSubSetSum(arr, n-1, sum-arr[n-1], dp) || checkSubSetSum(arr, n-1, sum, dp);
            return dp[n][sum];
        }
    }
}
