/**
 * https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7
 *
 * Finding SubSequences which has target sum as 5
 */

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSumBetter
{
    List<List<Integer>> resultList = new ArrayList<>();
    int count = 0;
    public static void main (String[] args)
    {
        int[] arr = {1,1,2,3,4,5};
        int sum =0;
        int target = 5;
        SubSequenceSumBetter subSequenceSum = new SubSequenceSumBetter();
        subSequenceSum.findCount(0, arr, new ArrayList<>(), sum, target);
        System.out.println("Count is:"+ subSequenceSum.count);
        for(List<Integer> list: subSequenceSum.resultList) {
            System.out.println(list);
        }
    }

    public void findCount(int index, int[] arr, List<Integer> tempList, int sum, int target) {

        if(index == arr.length) {
            if(sum == target) {
                ArrayList list = new ArrayList(tempList);
                resultList.add(list);
                count++;
            }
            return;
        }

        tempList.add(arr[index]);
        findCount(index+1, arr, tempList, sum+arr[index], target);
        tempList.remove(tempList.size()-1);

        findCount(index+1, arr, tempList, sum, target);

    }
}
