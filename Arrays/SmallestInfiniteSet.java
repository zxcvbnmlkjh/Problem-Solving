import java.util.PriorityQueue;

public class SmallestInfiniteSet
{
        PriorityQueue<Integer> queue;
        public SmallestInfiniteSet() {
            queue = new PriorityQueue<>(1005);
            for(int i= 1; i<1005; i++) {
                queue.add(i);
            }
        }
        public int popSmallest() {
            return queue.poll();
        }
        public void addBack(int num) {
            if(!queue.contains(num)) {
                queue.offer(num);
            }
        }

    public static void main (String[] args)
    {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        System.out.println(smallestInfiniteSet.popSmallest());
        System.out.println(smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        System.out.println(smallestInfiniteSet.popSmallest());
    }
    }
