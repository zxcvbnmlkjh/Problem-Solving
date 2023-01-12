import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArithmeticTriplet
{
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        ArithmeticTriplet arithmeticTriplet = new ArithmeticTriplet();
        arithmeticTriplet.arithmeticTripletNumber(nums, diff);
    }
    public int arithmeticTripletNumber(int[] nums, int diff) {
        int j=1;
        int i =0;
        boolean flag = false;
        Set<Integer> set = new HashSet<>();
        List<Set<Integer>> list = new ArrayList<>();
        while(j< nums.length){

            if(flag) {
                list.add(set);
                set = new HashSet<>();
                flag = false;
            }
            int elem = nums[j] - nums[i];
            if(diff > elem) {
                j++;
            }
            if(diff < elem) {
                i++;
            }
            if(diff == elem) {
                if(set.size()<3){
                    set.add(i);
                    set.add(j);
                }
                if(set.size()==3) {
                    flag = true;
                }
                i++;
                j++;
            }

        }
        for(Set s : list) {
            System.out.print("Set value is" + s);
        }
        return 0;
    }
}
