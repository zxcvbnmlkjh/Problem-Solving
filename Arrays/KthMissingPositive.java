import java.util.*;
import java.util.stream.Collectors;

public class KthMissingPositive {
    public static void main (String[] args)
    {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        KthMissingPositive kthMissingPositive = new KthMissingPositive();
        System.out.println(kthMissingPositive.findKthPositive(arr, k));
    }
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        int i =1;
        int count = 0;
        int res = -1;
        int lastElem = arr[arr.length-1];
        System.out.println(lastElem);
        while (i < Integer.MAX_VALUE) {
            if(!set.contains(i)) {
                count ++;
                System.out.println("Value of count is"+ count);
                System.out.println("Value of i is"+ i);
                if(count == k) {
                    break;
                }
            }
            i++;
        }
        res = i;
        return res;
    }
}
