/**
 * very very important question
 * Printing all the subsets with given sum
 * for this array no of sequences would be 2^N - 2^5 --> 32
 *
 * Now there are 2 scenarios this question can occur in 2 ways
 *
 * 1. U need to return all subArrays with sum 5 (Continuos SubArray) - This we solve with help of Prefix sum and map
 *
 *      Reference  - https://github.com/zxcvbnmlkjh/Problem-Solving/blob/main/Arrays/LargestSumSubArrayLength_Better.java
 *
 *
 * 2. U  need to return all subSets with sum 5 (Non continuos) -> There it comes backtracking current approach.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSum
{
    List<List<Integer>> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int sum =0;
        SubSequenceSum subSequenceSum = new SubSequenceSum();
        subSequenceSum.findSet(0, arr.length, new ArrayList<>(), arr);
        for(List<Integer> list: subSequenceSum.resultList) {
           sum = 0;
           for(int i : list) {
               sum = sum + i;
           }
            if(sum == 5) {
                System.out.println(list);
            }
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
