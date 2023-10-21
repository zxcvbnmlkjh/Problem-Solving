import java.util.List;

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
        int[] arr = {3,10,7,6,4,11,8,1,23};
        System.out.println("Profit is "+ buy.maxProfit(arr));
    }

    public int maxProfit(int[] arr) {
        int profit = 0;
        int minSoFar = arr[0]; // 7
        for(int i=1;i<arr.length;i++) {
            minSoFar = Math.min(minSoFar, arr[i]); // 6 4
            profit = Math.max(profit, arr[i] -minSoFar); //0 // 4
        }
        return profit;
    }
}
