/**
 * https://leetcode.com/problems/subsets/solutions/1766675/java-intuition-of-approach-backtracking/
 *
 * https://www.youtube.com/watch?v=AxNNVECce8c&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=6
 *
 * To calculate powerset we have formula 2^n = 8 in this case
 *
 * Time complexity for this apprroach would be 2^N
 * For every index we have 2 ways either include and exclude -- then it will be 2^n
 *
 * Space Complexity max will be at max n- Depth of recursion would be n calls in the auxilary stack.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class FindingSubSetPowerSet
{
    List<List<Integer>> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
        int[] arr = {1,2,3};
        FindingSubSetPowerSet findingSubSetPowerSet = new FindingSubSetPowerSet();
        findingSubSetPowerSet.findSet(0, arr.length, new ArrayList<>(), arr);
        for(List<Integer> list: findingSubSetPowerSet.resultList) {
            System.out.println(list);
        }
    }

    public void findSet (int index , int len, List<Integer> tempList , int[] arr) {

        // Here we are creating new list and copyting data to it and adding to resultList
        // if we use same reference will be passed and it will change the values.
        if(index == len) {
           resultList.add(new ArrayList<>(tempList));
           return;
        }

        // Include
        tempList.add(arr[index]);
        findSet(index+1, len, tempList, arr);

        // Remove Last element
        tempList.remove(tempList.size()-1);

        //Exclude
        findSet(index+1, len, tempList, arr);
    }
}
