package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class SubsetSum
{
        public int subarraySum(int[] nums, int k)
        {
            Map<Integer,Integer> map = new HashMap<>();
            int cumSum = 0;
            int count=0;
            for(int i=0; i< nums.length; i++) {
                cumSum = cumSum + nums[i]; // 3
                int remSum = cumSum - k; // 1
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

    public static void main (String[] args)
    {
        int[] arr = {1,1,1, 1};  // 1 2 3
        int  k = 2;
        SubsetSum subsetSum = new SubsetSum();
        System.out.println(subsetSum.subarraySum(arr, k));
    }
}
