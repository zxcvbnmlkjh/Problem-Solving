import java.util.ArrayList;
import java.util.List;

public class CombinationSum
{
    List<List<Integer>> result = new ArrayList<>();
    public static void main (String[] args)
    {
        int[] arr  = {2,3,6,7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        combinationSum.findPair(0, arr, new ArrayList<>(), 0, target);
        for(List<Integer> list : combinationSum.result) {
            System.out.println(list);
        }
    }
    public void findPair (int index, int[] arr,List<Integer> tempList, int sum, int target) {

            if(index > arr.length) {
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>(tempList);
                    result.add(temp);
                    System.out.println("Result is:" + result);
                    return;
                }
            }

        tempList.add(arr[index]);
        findPair(index+1, arr, tempList, sum+arr[index], target);
        tempList.remove(tempList.size()-1);
        findPair(index+1, arr, tempList, sum , target);

    }
}
