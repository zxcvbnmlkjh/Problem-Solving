package src; /**
 *
 * Logic behind this is we need to find Left Smaller and Right Smaller and then subtract rightSmaller-LeftSmaller-1 * height.
 *
 * This formula rightSmaller-LeftSmaller-1  is to calculate width, we need to do height * width.
 *
 * In this Problem to find largest rectangle
 *
 *
 * https://www.youtube.com/watch?v=X0X6G-eWgQ8&t=954s
 */

import java.util.Stack;

public class LargestRect_Histogram
{
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        LargestRect_Histogram rect = new LargestRect_Histogram();
        System.out.println("Area is "+ rect.getLargestRectangle(arr));
    }
    public int getLargestRectangle(int[] arr)
    {
        int[] nse = getNextSmallestElement(arr);
        int[] pse = getPrevSmallestElement(arr);
        int area = 0;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            area = ((nse[i] - pse[i]) - 1)*arr[i];
            if(area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    public int[] getNextSmallestElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = arr.length;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public int[] getPrevSmallestElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
