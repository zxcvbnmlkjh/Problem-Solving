/**
 * To get the count of subArrays which are giving a sum of 15.
 * We will keep adding all the array elements and store it into a map
 * I will be subtracting Sum - K and checking if that exists in map.
 * For Eg - {10+5+2+7+1} = 25, 25-15 will be 10 so if we have 10 in our map
 * That means there is an array in between which is giving a Sum of 15.
 *
 */

import java.util.HashMap;
import java.util.Map;

public class LargestSumSubArraysCount
{
    public static void main (String[] args)
    {
        //int[] arr = {10, 5, 2, 7, 1, 15};
        //int k = 15;
        int[] arr = {10, 15, -5, 15, -10, 5};
        // -10 -5 5 10 15 15
        int k = 20;
        LargestSumSubArraysCount largestSumSubArraysCount = new LargestSumSubArraysCount();
        System.out.println("No of Arrays is "+ largestSumSubArraysCount.subarraySum(arr, 20));

    }

    public int subarraySum(int[] nums, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int cumSum = 0;
        int count=0;
        for(int i=0; i< nums.length; i++) {
            cumSum = cumSum + nums[i];
            int remSum = cumSum - k;
            if(cumSum == k) {
                count++;
            }
            if(map.containsKey(remSum)) {
                count++;
            }
            map.put(cumSum, i);
        }
        return count;
    }
}
