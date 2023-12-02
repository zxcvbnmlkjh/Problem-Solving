/**
 * Two ways to solve this problem
 * 1 with help of Priority Queue
 * 2 with thw help of TreeSet
 * Both gives data in sorted manner.
 * Just the difference is
 *
 */

import java.util.TreeSet;

public class SmallestInfiniteSet2
{
        TreeSet<Integer> set;
        public SmallestInfiniteSet2() {
            set = new TreeSet<>();

            for(int i= 1; i<1005; i++) {
                set.add(i);
            }

        }

        public int popSmallest() {

            return set.pollFirst();

        }

        public void addBack(int num) {

            if(!set.contains(num)) {
                set.add(num);
            }

        }

    public static void main (String[] args)
    {
        SmallestInfiniteSet2 smallestInfiniteSet2 = new SmallestInfiniteSet2();
        System.out.println(smallestInfiniteSet2.popSmallest());
        System.out.println(smallestInfiniteSet2.popSmallest());
        smallestInfiniteSet2.addBack(1);
        System.out.println(smallestInfiniteSet2.popSmallest());
    }
}
