package Immutability;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain
{
    public static void main (String[] args) throws CloneNotSupportedException
    {

        String name = "Priyanka";
        Integer num = 123;
        Address add = new Address(1, "Abohar");
        Employee employee = new Employee(name, num, add);

        System.out.println("Employee obj before"+ employee);
        Address add1 = employee.getAddress(); // this wont change as we are getting cloned object from get method
        add1.name = "Delhi";
        num = 222;
        name = "Sneha";
      System.out.println("Employee obj after"+ employee);
    }
}
