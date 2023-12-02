/**
 * Rever other solution FindingSubSetPowerSet
 */

import java.util.ArrayList;
import java.util.List;

public class FindSubSet_BT
{
        public static void main (String[] args)
        {
            int[] arr = {1,2,3};
            FindSubSet_BT findSubSetsUsingBT = new FindSubSet_BT();
            List<List<Integer>> subset = new ArrayList();
            findSubSetsUsingBT.dfs(subset,0,arr,new ArrayList());
            for(List<Integer> list : subset) {
                System.out.println(list);
            }
        }
    void dfs( List<List<Integer>> subset,int index,int[] nums,List<Integer> current){
        subset.add(new ArrayList(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            dfs(subset,i+1,nums, current);
            current.remove(current.size()-1);
        }
    }
}
