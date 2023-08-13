import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations/
 *
 */
public class Combination
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4};
        int k =2;

        Combination combination = new Combination();
        List<Integer> resList = new ArrayList<>();
        combination.findSeq(arr, 0, 0, 2, resList);
    }

    public void findSeq (int[] arr, int index, int pos , int k,  List<Integer> resList) {


        if(pos == k) {
            for(int i : resList) {
                System.out.println(i);
            }
            resList = new ArrayList<>();
            System.out.print("\n");
            return;
        }
        resList.add(arr[pos]);

        findSeq(arr, index, pos+1, k, resList);
        findSeq(arr, index+1, pos, k, resList);
    }
}
