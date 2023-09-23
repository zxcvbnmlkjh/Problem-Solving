package src;

import java.util.Stack;

public class PreviousGreaterElement
{
    public static void main (String[] args)
    {
        int[] arr = {5, 4, 6, 1, 7, 9, 8}; // -1, 5, -1, 6, -1, -1, 9
        PreviousGreaterElement prev = new PreviousGreaterElement();
        int[] result = prev.prevGreaterElement(arr);
        for(int i : result) {
            System.out.print(i + "    ");
        }
    }

    int[] prevGreaterElement (int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();

        int[] result = new int[arr.length];

        for(int i=0; i<arr.length; i++) {

            while(!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
