/**
 * https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
 *
 * Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
 * Output: 1 to 6 size  - 6
 */
public class CountEqualNumbers
{
    public static void main (String[] args)
    {
        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        CountEqualNumbers countEqualNumbers = new CountEqualNumbers();
        System.out.println("Size is:"+ countEqualNumbers.findsize(arr));
    }

    public int findsize (int[] arr) {

        int len = 0;
        for(int i=0; i<arr.length;i++) {
            int count0 = 0;
            int count1 = 0;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] == 0) {
                    count0++;
                } else {
                    count1++;
                }

                if(count0 == count1) {
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
}
