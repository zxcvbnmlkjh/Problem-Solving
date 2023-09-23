/*
Find MinSofar and subtract minSofar from a[i]. Technique is we need to first
find min price and max price after that.
Time Complexity- O(N) Linear
Space Complexity- O(1)
 */
public class Buy_Sell_Stock
{
    public static void main(String[] args) {
        Buy_Sell_Stock buy = new Buy_Sell_Stock();
        int[] arr = {7,6,4,3,1};
        System.out.println("Profit is "+ buy.maxProfit(arr));
    }

    public int maxProfit(int[] arr) {
        int profit = 0;
        int minSoFar = arr[0];
        for(int i=1;i<arr.length;i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            profit = Math.max(profit, arr[i] -minSoFar);
        }
        return profit;
    }
}
