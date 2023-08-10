/**
 * Find First and Last Position of Element in Sorted Array
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 */
public class SearchFirstLastIndex
{
    public static void main (String[] args)
    {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        SearchFirstLastIndex searchFirstLastIndex = new SearchFirstLastIndex();
        int[] res = searchFirstLastIndex.searchRange(nums, target);
        for(int i : res) {
            System.out.print(i + " ");
        }
    }

    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;
        int[] res = {-1, -1};

        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                res[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target ) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                res[1] = mid;
                start = mid + 1;
            } else if (nums[mid] > target ) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
