package Knapsack;

public class KnapSackDP
{
    public static void main(String[] args) {
       /* int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;*/
        int[] value = { 10, 20 ,30, 40 };
        int[] wt = { 30, 10, 40, 20 };
        int Weight = 40;
        int N = value.length;
        KnapSackDP dp = new KnapSackDP();
        System.out.println("Max Profit is==== " + dp.getProfitByDP(value, wt, Weight , N));
    }
    public int getProfitByDP (int[] val, int[] wt, int W, int N)
    {
        int K[][] = new int[N + 1][W + 1];
        for(int i=0; i<N+1;i++) {
            for(int j=0; j<W+1; j++) {
                if(i==0 || j==0) {
                    K[i][j] = 0;
                }
                else if(wt[i-1] <= j) {
                    K[i][j] = Math.max(val[i-1]+ K[i-1][j-wt[i-1]], K[i-1][j]);
                } else {
                    K[i][j] = K[i-1][j];
                }
            }
        }

        return K[N][W];
    }
}
