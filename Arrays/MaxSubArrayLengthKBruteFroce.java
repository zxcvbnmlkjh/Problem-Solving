public class MaxSubArrayLengthKBruteFroce
{
    public static void main (String[] args)
    {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        int maxSum = maxSumSubarray(arr, n, k);
        System.out.println(maxSum);
    }

    static int maxSumSubarray(int arr[], int n, int k)
    {
        int max_sum = 0;
        for (int i = 0; i + k <= n; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
}
