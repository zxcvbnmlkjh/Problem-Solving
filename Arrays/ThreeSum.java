/**
 * https://leetcode.com/problems/3sum/description/
 *
 * https://www.youtube.com/watch?v=DhFh8Kw7ymk
 *
 */

import java.util.*;

public class ThreeSum
{
    public static void main (String[] args)
    {
        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        Set<List<Integer>> resultList = threeSum.findSum(nums);

        for(List<Integer> list : resultList) {
            System.out.println(list);
        }

    }

    public Set<List<Integer>> findSum(int[] nums) {

        Set<List<Integer>> resultList = new HashSet<>();
        for(int i=0; i<nums.length-1;i++) {
            Set<Integer> set =new HashSet<>();
            for(int j=i+1; j<nums.length; j++) {
                int sum = nums[i]+ nums[j];
                int rem = 0 - sum;
                System.out.println("Rem is:" + rem);
                if(set.contains(rem)) {
                    System.out.println("Present:"+ rem);
                    List list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(rem);
                    Collections.sort(list);
                    resultList.add(list);
                    set.add(nums[j]);
                } else{
                    set.add(nums[j]);
                }


            }
        }

        return resultList;
    }
}
