package Knapsack;

public class KnapSackRecursion
{
    public static void main(String[] args) {
        int[] value = { 10, 20 ,30, 40 };
        int[] wt = { 30, 10, 40, 20 };
        int Weight = 40;
        int N = wt.length;
        KnapSackRecursion recursion = new KnapSackRecursion();
        int profit =recursion.getProfitByKnapSack(wt,value, Weight, N);
        System.out.println("Max Profit is:"+ profit);
    }

    public int getProfitByKnapSack (int[] wt, int[] val, int W, int N)
    {
            if(N==0 || W==0) {
                return 0;
            }
            if(wt[N-1] > W) {
                return getProfitByKnapSack(wt, val, W , N-1);
            } else {
                return Math.max(val[N-1]+ getProfitByKnapSack(wt, val, W-wt[N-1],N-1), getProfitByKnapSack(wt, val, W , N-1));
            }
    }
}
