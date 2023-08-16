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
        Employee emp1 = new Employee(13, "Sneha", "Delhi");
        Employee emp2 = new Employee(43, "Priyanka", "Abohar");
        Employee emp3 = new Employee(390, "Ankita", "Ghaziabad");
        Employee emp4 = new Employee(43, "Aakshi", "Ghaziabad");
        Employee emp5 = new Employee(17, "Naina", "Ghaziabad");
        Employee emp6 = new Employee(17, "abc", "Ghaziabad");
        Employee emp7 = new Employee(43, "xyz", "Ghaziabad");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);

        Collections.sort(empList);
        System.out.println("Sorted Employee List"+ empList);


    }
}
