/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 *
 *
 * Binary Search
 */
public class FindMinimumInSortedRotatedArray
{
    public static void main (String[] args)
    {
        int[] arr = {3,4,5,0,1,2};
        FindMinimumInSortedRotatedArray findMinimumInSortedRotatedArray = new FindMinimumInSortedRotatedArray();
        System.out.println(findMinimumInSortedRotatedArray.findMin(arr));
    }

    public int findMin(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }
        int start =0;
        int end = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(start<=end) {
            int mid = (start+end)/2;
            ans = Math.min(nums[mid], ans);
            if(nums[mid]< nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
