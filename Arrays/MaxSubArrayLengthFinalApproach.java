public class MaxSubArrayLengthFinalApproach
{
    public static void main (String[] args)
    {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        int maxSum = maxSum(arr, n, k);
        System.out.println(maxSum);
    }
    public static int maxSum(int arr[], int n, int k)
    {
        if (n < k)
        {
            System.out.println("Invalid");
            return -1;
        }
        int res = 0;
        for(int i=0 ;i <k; i++) {
            res += arr[i];
        }
        int curr_sum = res;
        for(int i=k; i<n; i++) {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }
        return res;
    }
}
