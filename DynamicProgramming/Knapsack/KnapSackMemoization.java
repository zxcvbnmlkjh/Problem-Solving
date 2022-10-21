package Knapsack;

public class KnapSackMemoization
{
    public static void main(String[] args) {
       /* int[] value = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int Weight = 50;*/
        int[] value = { 10, 20 ,30, 40 };
        int[] wt =    { 30, 10, 40, 20 };
        int Weight = 40;
        int N = wt.length;
        int dp[][] = new int[N+1][Weight+1];
        for(int i=0; i<N+1 ; i++) {
            for(int j = 0; j<Weight+1 ;j++) {dp[i][j] = -1;
            }
        }
        KnapSackMemoization recursion = new KnapSackMemoization();
        int profit = recursion.getProfitByMemoization(wt,value, Weight, N , dp);
        System.out.println("Max Profit is:"+ profit);
    }
    public int getProfitByMemoization (int[]wt, int[]val, int W, int N, int[][] dp)   // N+1 W+1
    {
       if(N==0 || W==0) {
           return 0;
       }
       if(dp[N][W] != -1) {
           return dp[N][W];
       }
       if(wt[N-1]>W) {
            dp[N][W] = getProfitByMemoization(wt, val, W, N-1, dp);
           return dp[N][W];
       } else {
           dp[N][W] = Math.max(val[N-1] + getProfitByMemoization(wt,val, W-wt[N-1], N-1, dp), getProfitByMemoization(wt, val, W, N-1, dp));
           return dp[N][W];
       }
    }
}
