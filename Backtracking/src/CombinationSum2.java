/**
 * https://leetcode.com/problems/combination-sum/description/
 *
 * Either we will take same index again n again or we will not take current index we will take next index
 *
 * Before we take next index we need to remove last element from array.
 *
 * Complexity will be 2^N.
 *
 */

import java.util.List;
import java.util.ArrayList;
public class CombinationSum2
{
    List<List<Integer>> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
      int[] arr = {2,3,6,7};
      CombinationSum2 combinationSum2 = new CombinationSum2();
      List<List<Integer>> finalList = combinationSum2.combinationSum(arr, 7);
      for(List<Integer> list : finalList) {
          System.out.println("list is:" + list);
      }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

       findCombination(0, candidates, 0, target, new ArrayList<>());
        return resultList;
    }

    public void findCombination (int index, int[] num, int sum, int target, List<Integer> output) {

        if(index >= num.length || sum>target) {
            return;
        }

        if(target == sum) {
            resultList.add(new ArrayList<>(output));
            return;
        }

        // Pick
        output.add(num[index]);

        findCombination(index, num, sum+num[index], target, output);

        // Remove or backtrack
        output.remove(output.size()-1);

        // Not Pick
        findCombination(index+1, num, sum, target, output);



    }
}
