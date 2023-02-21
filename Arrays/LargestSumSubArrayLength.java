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
        int maxCount = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++) {
            int sum =0;
            int j= i;
            int count=0;
            while(sum < K && j<arr.length) {
                sum = sum + arr[j];
                count++;
                j++;
            }
            if(sum == K) {
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
