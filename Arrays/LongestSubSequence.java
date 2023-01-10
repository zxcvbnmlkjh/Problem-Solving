import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubSequence {

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        LongestSubSequence subSequence = new LongestSubSequence();
        System.out.println("Longest Subsequence value is: "+ subSequence.longestConsecutive(arr));
    }

    public int longestConsecutive(int[] nums)
    {
        int maxCount = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet();
        for(int i =0 ;i<nums.length; i++) {
            set.add(nums[i]);
        }
        if(nums.length == 0) {
            maxCount = 0;
        }
        for(int i=0; i<nums.length;i++) {
            boolean flag = true;
            int count = 1;
            int p = 1;
            if(!set.contains(nums[i]-p)) {
                while(set.contains(nums[i]+p))
                {
                    p++;
                    count++;
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}