/**
 * https://leetcode.com/problems/divide-array-into-equal-pairs/
 *
 *  Divide Array Into Equal Pairs
 */

import java.util.Arrays;

public class DivideArrayInEqualPair
{
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,1};
        DivideArrayInEqualPair divideArrayInEqualPair = new DivideArrayInEqualPair();
        System.out.println("Value is "+ divideArrayInEqualPair.divideArray(arr));
    }
    public boolean divideArray(int[] nums) {
        if(nums.length%2 != 0) {
            return false;
        } else {
            Arrays.sort(nums);
            int i = 0;
            int j = i+1;
            while(j<nums.length) {
                if(nums[i] != nums[j]) {
                    return false;
                } else {
                    i = i+2;
                    j = j+2;
                }
            }

        }
        return true;
    }
}
