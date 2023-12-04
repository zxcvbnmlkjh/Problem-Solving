import java.util.HashMap;

/**
 *  * * https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 *  *
 *  * Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
 *  * Output: 1 to 6 size  - 6
 *  *
 *  * https://www.youtube.com/watch?v=SBBBLaLkf1A
 *  *
 *  * Method 2: Hashmap.
 *  *
 *  * Approach: The concept of taking cumulative sum, taking 0’s as -1 will help us in optimizing the approach.
 *  * While taking the cumulative sum, there are two cases when there can be a sub-array with equal number of 0’s and 1’s.
 *  *
 *  * When cumulative sum=0, which signifies that sub-array from index (0) till present index has equal number of 0’s and 1’s.
 *  * When we encounter a cumulative sum value which we have already encountered before, which means that sub-array from
 *  * the previous index+1 till the present index has equal number of 0’s and 1’s as they give a cumulative sum of 0 .
 */
public class CountEqualNumbersBetter1
{
    public static void main (String[] args)
    {
        int[] arr = {};
        CountEqualNumbersBetter1 countEqualNumbers = new CountEqualNumbersBetter1();
        System.out.println(countEqualNumbers.findSize(arr));
    }

    public int findSize (int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i< arr.length;i ++) {
            if(arr[i] == 0) {
                arr[i] = -1;
            }
        }

        for(int i=0 ; i< arr.length;i++)
        {
            sum = sum + arr[i];
            if(map.containsKey(sum)) {
                count++;
            } else {
                map.put(sum, i);
            }
        }

        return count;
    }

}
