import java.util.PriorityQueue;

public class FindKthLargestElementUsingPQ
{

    public void findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int j = 1;
        for(int i : arr) {
            queue.add(i);
        }
        while (j<k) {
            queue.poll();
            j++;
        }
        System.out.println("Value peeked from queue:"+ queue.peek());
    }

    public static void main(String[] args) {
        int arr[] = {-1, 22, 0, 6,7,3,2,90};
        FindKthLargestElementUsingPQ kthLargestElementUsingPQ = new FindKthLargestElementUsingPQ();
        kthLargestElementUsingPQ.findKthLargest(arr, 3);
    }
}
