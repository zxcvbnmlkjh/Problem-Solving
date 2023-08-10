/**
 * Binary Search
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 */
public class SearchElement
{
    public static void main (String[] args)
    {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        SearchElement searchElement = new SearchElement();
        System.out.println("Found target at: " + searchElement.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = (start+ end)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
