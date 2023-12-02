import java.util.PriorityQueue;

public class FindSecondMax
{
    public static void main (String[] args)
    {
        int[] arr = {34, 17, 23, 5, 1};
        FindSecondMax secondMax = new FindSecondMax();
        System.out.println(secondMax.findMax(arr, 2));

    }

    public int findMax (int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue(); // Min Heap
        for(int i : arr) {
            pq.add(i);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
