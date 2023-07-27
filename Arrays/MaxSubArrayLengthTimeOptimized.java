// In this approach we are using Prefix Sum along with Sliding Window

// Space Complexity we need to reduce

public class MaxSubArrayLengthTimeOptimized
{
    public static void main (String[] args)
    {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        int[] PSum = new int[n];
        PSum[0] = arr[0];
        for(int i=1 ;i <n ;i++) {
            PSum[i] = PSum[i-1] + arr[i];
        }
        int maxSum = maxSumSubarray(arr, PSum, n, k);
        System.out.println(maxSum);
    }
    static int maxSumSubarray(int arr[],int[] prefixSum, int n, int k)
    {
        int max_sum = 0;
        int i =0;
        int j = i+k-1;
        while(j < n) {
            int sum = 0;
            sum = (i == 0) ? prefixSum[j] : (prefixSum[j] - prefixSum[i-1]);
            max_sum = Math.max(max_sum, sum);
            i++; j++;
        }
        return max_sum;
    }
}
