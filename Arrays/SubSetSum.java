import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */

public class SubSetSum
{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> list = new ArrayList<>();
        SubSetSum subSetSum = new SubSetSum();
        int sum = 0;
        subSetSum.findSubSetSum(nums,0,list, sum);
        Collections.sort(list);
        for(int element : list) {
            System.out.print(element + " ");
        }
    }
    public void findSubSetSum(int[] nums,int index, List<Integer> list, int sum)
    {
        if(index == nums.length){
            list.add(sum);
            return;
        }
        findSubSetSum(nums, index+1, list, sum+nums[index]);
        findSubSetSum(nums, index+1, list, sum);
    }
}
