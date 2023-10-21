/*Given an array and an integer K, find the maximum for each and every contiguous subarray of size K.

    Examples :

    Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
    Output: 3 3 4 5 5 5 6

    Brute Force - Slide window of size K and for every K elements find max in that window. Complexity would be O(N^2)
    Better Approach - Using Priority Queue Heaps for size K create a heap of size and return the top element from the heap.
    Optimized Approach - Using a Dequeue we can solve this problem, if u have left element or element in dequeue smaller

 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        SlidingWindowMax slidingWindowMax = new SlidingWindowMax();
        slidingWindowMax.findMax(arr, 3);
    }

    public void findMax (int[] arr, int k) {

        Deque<Integer> queue =new LinkedList<Integer>();
        for(int i=0; i<k; i++) {
            while (!queue.isEmpty() && arr[i] > arr[queue.peek()]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }

        for(int i=k; i<arr.length; i++ ) {
            System.out.println(arr[queue.peek()]);

            while(!queue.isEmpty() && queue.peek()<= i-k) {
                queue.removeFirst();
            }

            while(!queue.isEmpty() && arr[queue.peekLast()]<arr[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }

        System.out.println(arr[queue.peek()]);

    }
}
