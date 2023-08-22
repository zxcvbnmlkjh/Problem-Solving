import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsingComparator
{
    public static void main (String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new IntegerComparator());
        pq.add(23);
        pq.add(12);
        pq.add(-6);
        pq.add(1);
        pq.add(60);
        pq.add(54);

        int i =0;
        while (i<3) {
            pq.poll();
            i++;
        }
        System.out.println(pq.peek());

        PriorityQueue<Employee> pq1 = new PriorityQueue<>();
        Employee emp1 = new Employee(1, "Priyanka");
        Employee emp2 = new Employee(2, "Sneha");
        Employee emp3 = new Employee(3, "Naina");
        Employee emp4 = new Employee(4, "Priyanka");
        pq1.add(emp1);
        pq1.add(emp2);
        pq1.add(emp3);
        pq1.add(emp4);

        System.out.println(pq1.peek());

    }
}

class IntegerComparator implements Comparator<Integer>
{
    @Override public int compare (Integer o1, Integer o2)
    {
        return o2 - o1;
    }
}

class Employee implements Comparable<Employee>
{
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override public int compareTo (Employee o)
    {
        int val = this.name.compareTo(o.name);
        if(val != 0) {
            return -val;
        }
        return this.id - (o.id);
    }

    @Override public String toString ()
    {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
