import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementUsingPriorityQueue
{
    public static void main (String[] args)
    {
        int[] arr = {-1, 3,45, 23, 78,12, 90, 5, 32, 87, -2};

        FindKthSmallestElementUsingPriorityQueue find = new FindKthSmallestElementUsingPriorityQueue();
        System.out.println(find.findKthSmallest(arr, 4));
    }
    public int findKthSmallest (int[] arr, int k) {
        PriorityQueue<Integer> p = new PriorityQueue(Collections.reverseOrder()); // Max Heap
        for(int i : arr) {
            p.add(i);
            if(p.size()>k) {
                p.poll();
            }
        }
        return p.peek();
    }
}
