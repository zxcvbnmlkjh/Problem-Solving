import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE1 {


    public static void main(String[] args) {
        int[] arr = {4,1,2};   //{3,4,-1,-1}
        int[] arr1 = {1,3,4,2};
        NGE1 ng = new NGE1();
        int[] res = ng.nextGreaterElement(arr, arr1);

        int j = 0;
        while(j< res.length) {
            System.out.print(res[j] + " ");
            j++;
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];

        for(int i=nums2.length-1; i>=0; i--)
        {
            while (!stack.isEmpty() && stack.peek()<nums2[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                map.put(nums2[i] , -1);

            } else {
                map.put(nums2[i] , stack.peek());
            }
            stack.push(nums2[i]);
        }

        for(int j =0 ; j< nums1.length; j++)
        {
            result[j] = map.get(nums1[j]);

        }
        return result;

    }
}
