package src;

import java.util.*;

public class PreviousSmallerElement
{
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3,1};
        PreviousSmallerElement pse = new PreviousSmallerElement();
        int[] res = pse.getPreviousSmallerArray(arr);
        for(int i=0; i<res.length;i++)
        {
            System.out.print(res[i] + " ");
        }
    }

    public int[] getPreviousSmallerArray(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && stack.peek()>= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
