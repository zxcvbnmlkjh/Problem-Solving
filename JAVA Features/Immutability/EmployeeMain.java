package Immutability;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain
{
    public static void main (String[] args)
    {
        List list = new ArrayList();
        list.add("Abohar");
        list.add("Delhi");
        Employee e = new Employee("Priyanka", 123, list);
        System.out.println(list);
        list.add("Bangalore"); // This way actual list is getting modified which breaks the immutablity concept.
        System.out.println("List after addition"+ list);
        System.out.println("Name is:"+ e.name);
        e.name = "Sneha";
        System.out.println("Name is:"+ e.name);
    }
}
