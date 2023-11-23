package src;

import java.util.Stack;

public class NGECircularArray
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,1};
        NGECircularArray nge = new NGECircularArray();
        int[] res = nge.findArray(arr);
        for(int i : res) {
            System.out.println("Result Array is:" + i);
        }
    }
    public int[] findArray(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        int n = arr.length;
        for(int i= 2*n-1; i>=0 ; i--) {

            while (!stack.isEmpty() && stack.peek()<=arr[i%n]) {
                stack.pop();
            }
            if(i<n) {
                if (!stack.isEmpty()) {
                    result[i] = stack.peek();
                }
                else {
                    result[i] = -1;
                }
            }
            stack.push(arr[i%n]);
        }
        return result;
    }
}
