/**
 *  * To get the count of subArrays which are giving a sum of 15.
 *  * We will keep adding all the array elements and store it into a map
 *  * I will be subtracting Sum - K and checking if that exists in map.
 *  That means there is an array in between which is giving a Sum of 15.
 *  * For Eg - {10+5+2+7+1} = 25, 25-15 will be 10 so if we have 10 in our map
 *  to find the length of the array we will subtract map.get(10) and current i value.
 *  10 key has value as 0 and 25 key has key as 4.
 *  *
 *  One more variation of this questions is
 * Largest subarray with equal number of 0s and 1s
 * https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 */

import java.util.HashMap;
import java.util.Map;

public class LargestSumSubArrayLength_Better
{
    public static void main (String[] args)
    {
        int[] arr = {10, 5, 2, 7, 1, 15};
        int k = 15;
        LargestSumSubArrayLength_Better largestLength = new LargestSumSubArrayLength_Better();
        System.out.println("Length is " + largestLength.findLength(arr, k));
    }

    public int findLength (int[] arr, int K)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int cumSum = 0;
        int count= Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++)
        {
            cumSum = cumSum + arr[i];
            int remSum = cumSum - K;
            if(cumSum == K) {
                count = Math.max(count, i+1);
            }
            if(map.containsKey(remSum)) {

                count = Math.max(count , i - map.get(remSum));
            }
            map.put(cumSum, i);
        }
        return count;
    }
}
