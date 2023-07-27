import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo
{
    public static void main (String[] args)
    {
        List list = new LinkedList();
        list.add("Priyanka");
        list.add("Sneha");
        list.add("Ankita");
        list.add("xyz");
        list.add("low");

        System.out.println("Normal list:"+ list);
        Collections.sort(list);
        System.out.println("Sorted List"+ list);

        List<Employee> empList = new ArrayList<Employee>();
        Employee emp1 = new Employee(1, "Sneha", "Delhi");
        Employee emp2 = new Employee(2, "Priyanka", "Abohar");
        Employee emp3 = new Employee(3, "Ankita", "Ghaziabad");
        Employee emp4 = new Employee(4, "Aakshi", "Ghaziabad");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        Collections.sort(empList);
        System.out.println("Sorted Employee List"+ empList);


    }
}
