/**
 * https://leetcode.com/problems/subsets/
 *
 * Subsets
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * Solution is-  Initially add {} empty list to an array then start adding each element to the existing list
 * For Eg This empty set{} --> for 1 add 1 to empty list --> {}, {1} -- For 2 Add 2 in existing lists --> {2}, {1,2} {} {1}
 *
 * time Complexity would be - O(N)* O(2^N) - N times out loop and 2^N times inner loop
 *
 * Space complexity would be --> O(n * 2^N)
 */
import java.util.ArrayList;
import java.util.List;

public class PowerSets
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3};
        PowerSets powerSets = new PowerSets();
        List<List<Integer>> resList = new ArrayList<>();
        resList.add(new ArrayList<>());
        powerSets.getSubSets(arr, resList);

        for(List<Integer> list : resList) {
            System.out.println(list);
        }
     }


    //{}
    public List<List<Integer>> getSubSets (int[] arr, List<List<Integer>> resList)
    {
        for(int n : arr) { // 1 2 3   n
            int size = resList.size();
            for(int i=0 ;i < size; i++) {   // 2^n
                List<Integer> res = new ArrayList<>(resList.get(i)); // List {} {1}
                res.add(n); // {1} {2} {1,2}
                resList.add(res); // {}, {1} {2} {1,2}
            }
        }
            return resList;
    }
}
