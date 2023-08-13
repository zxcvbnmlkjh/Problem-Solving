/**
 * https://leetcode.com/problems/subsets/
 *
 * Subsets
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */

import java.util.ArrayList;
import java.util.List;

public class FindSubSets
{
    public static void main (String[] args)
    {
        int[] arr = {1,2 ,3};
        FindSubSets findSubSets = new FindSubSets();
        List<Integer> outputList = new ArrayList<>();
        List<List<Integer>> resList = new ArrayList<>();
        findSubSets.findSubset(arr, 0, outputList, resList);
        for(List<Integer> list : resList) {
            for(int i : list) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
     }
    public void findSubset (int[] arr, int index, List<Integer> output, List<List<Integer>> resList) {

        if(index >= arr.length) {
            List<Integer> tempList = new ArrayList<>();
            tempList.addAll(output);
           resList.add(tempList);
           return ;
        }

        // Exclude

        findSubset(arr, index+1,  new ArrayList<>(output), resList);

        // Inclusion
        output.add(arr[index]);
        findSubset(arr, index+1,  new ArrayList<>(output), resList);
    }
}
