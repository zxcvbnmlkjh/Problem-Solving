/**
 * get the count of subArrays which are giving a sum of 15.
 */
public class LargestSumSubArrayLength
{
    public static void main (String[] args)
    {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        LargestSumSubArrayLength largestSumSubArray = new LargestSumSubArrayLength();
        System.out.println("Count is "+ largestSumSubArray.findCount(arr, k));

    }

    public int findCount(int[] arr, int K) {
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            int sum =0;
            int j= i;
            int len=0;
            while(sum < K && j<arr.length) {
                sum = sum + arr[j];
                len++;
                j++;
            }
            if(sum == K) {
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
