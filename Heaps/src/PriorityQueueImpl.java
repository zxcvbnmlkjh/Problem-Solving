/**
 * Priority queue by default gives in Min Heap and for Max heap we need to provide custom comparator for Objects.
 *
 * For primitive datatype in heap like integers and strings we just pass Collections.reverseOrder().
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl
{
    public static void main (String[] args)
    {
        PriorityQueue priorityQueue = new PriorityQueue(Collections.reverseOrder()); // Max Heap
        priorityQueue.add(23);
        priorityQueue.add(33);
        priorityQueue.add(3);
        priorityQueue.add(13);
        priorityQueue.add(90);

        System.out.println(priorityQueue);

        // 3rd largest
        int i =1;
        while(i < 3) {
            priorityQueue.poll();
            i++;
        }
        System.out.println(priorityQueue.peek());

        PriorityQueue<Emp> pq2 = new PriorityQueue<>();
        Emp emp1 = new Emp(1, "Pinku");
        Emp emp2 = new Emp(2, "Sneha");
        Emp emp3 = new Emp(3, "Ankita");
        Emp emp4 = new Emp(0, "Ankita");
        Emp emp5 = new Emp(5, "Zxxs");

        pq2.add(emp1);
        pq2.add(emp2);
        pq2.add(emp3);
        pq2.add(emp4);
        pq2.add(emp5);
        System.out.println(pq2);
    }
}

class IntComparator implements Comparator<Integer>
{

    @Override public int compare (Integer o1, Integer o2)
    {
        return o2 - o1;
    }
}

class Emp implements Comparable<Emp> {

    private int id;
    private String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override public int compareTo (Emp o)
    {
        if(this.name.compareTo(o.name) == 0) {
            return this.id - o.id;
        }
        return this.name.compareTo(o.name);
    }

    @Override public String toString ()
    {
        return "Emp{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}

