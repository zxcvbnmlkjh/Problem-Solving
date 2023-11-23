import java.util.*;

public class SlidingWindowMaxPQImplementation
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        SlidingWindowMaxPQImplementation slidingWindowMax = new SlidingWindowMaxPQImplementation();
        System.out.println(slidingWindowMax.findMax(arr, 3));
    }
    public List<Integer> findMax (int[] arr, int elem) {
        List<Integer> resultList = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        int  i =0;
        while(i < arr.length) {
            if(queue.size() < elem) {
                queue.add(arr[i]);
            } else {
                resultList.add(queue.peek());
                queue.remove(arr[i-elem]);
                queue.add(arr[i]);
            }
            i++;
        }
        resultList.add(queue.peek());
        return resultList;
    }
}
