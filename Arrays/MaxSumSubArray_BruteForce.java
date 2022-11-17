// Find Maximum Sum SubArray Using Brute Force approach with Time Complexity O(N^2).

public class MaxSumSubArray_BruteForce
{
    public int findSum (int[] arr)
    {
        int maxSum;
        //This covers when we have just one element
        if(arr.length == 1) {
            maxSum = arr[0];
        } else {
             maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int sum = arr[i]; // -1
                if(sum>maxSum){
                    maxSum = sum;
                }
                    for (int j = i + 1; j < arr.length; j++) {
                      // This is the case when your new elem is greater than the sum of prev elements
                       if(arr[j] > sum + arr[j]) {
                            sum = arr[j];
                        } else {
                            sum = sum + arr[j];
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        MaxSumSubArray_BruteForce subArray = new MaxSumSubArray_BruteForce();
        System.out.println("MAx sum is:"+ subArray.findSum(arr));
    }
}
