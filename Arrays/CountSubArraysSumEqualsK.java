/**
 * https://www.geeksforgeeks.org/find-all-subsequences-with-sum-equals-to-k/
 *
 * Using Hashmap to check if PrefixSum-K exists in the map that means we have the subArray with that sum.
 */

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysSumEqualsK
{
    public static void main (String[] args)
    {
        int [] arr = {17, 18, 6, 11, 2, 4};
        int k = 6;
        CountSubArraysSumEqualsK countSubArraysSumEqualsK = new CountSubArraysSumEqualsK();
        System.out.println("Count is" + countSubArraysSumEqualsK.findCount(arr, k));
    }

    public int findCount (int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int pSum = 0;
        int remSum = 0;
        int count  = 0;
        for(int i : arr) {
            pSum = pSum + i;
            remSum = Math.abs(k - pSum);
            System.out.println("Rem sum is:" + remSum);
            if(map.containsKey(remSum)) {
                count++;
            }
            if(map.containsKey(pSum)) {
                map.put(pSum , map.get(pSum)+1);
            } else {
                map.put(pSum , 1);
            }
        }
        return count;
    }
}
