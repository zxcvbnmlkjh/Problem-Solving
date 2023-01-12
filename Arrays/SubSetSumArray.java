import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSumArray
{
        public static void main(String[] args) {
            int[] nums = {1,2,3};
            List<Integer> list = new ArrayList<>();
            SubSetSumArray subSetSum = new SubSetSumArray();
            int sum = 0;
            List<List<Integer>> resultList = new ArrayList<>();
            subSetSum.findSubSetSumArray(nums,0,list, resultList);
            for(List<Integer> element : resultList) {
                System.out.print(element + " ");
            }
        }
        public void findSubSetSumArray(int[] nums,int index, List<Integer> list, List<List<Integer>> resultList)
        {
            if(index == nums.length){
                resultList.add(list);
                return;
            }
            findSubSetSumArray(nums, index+1, list, resultList);

            findSubSetSumArray(nums, index+1, updatedList(list, nums[index]), resultList);

        }
    public List<Integer> updatedList(List<Integer> list, int number){
        list.add(number);
        return list;
    }
    }
