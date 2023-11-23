// Find Maximum Sum SubArray Using Kadane's algo with Time Complexity O(N).

public class MaxSumSubArray_Kadanes
{
    public int getMaxSum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        if(nums.length == 1) {
            return nums[0];
        }

        for(int i=0 ;i<nums.length;i++) {

            sum = sum + nums[i];

            if(sum> maxSum) {
                maxSum = sum;
            }

            if(sum< 0) {
                sum =0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        MaxSumSubArray_Kadanes maxSumSubArray_kadanes = new MaxSumSubArray_Kadanes();
        System.out.println("Result Array is: "+ maxSumSubArray_kadanes.getMaxSum(arr));
    }
}
