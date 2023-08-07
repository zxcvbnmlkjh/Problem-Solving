package Immutability;

import java.util.ArrayList;
import java.util.List;

public class EmpShallowCloneMain
{
    public static void main (String[] args) throws CloneNotSupportedException
    {
        List list = new ArrayList();
        list.add("Abohar");
        list.add("Delhi");
        Address address = new Address(1, "Home");
        EmpShallowClone emp1 = new EmpShallowClone("Priyanka", 1, list, address);

       EmpShallowClone emp2 = (EmpShallowClone) emp1.clone();

       emp2.getAddress().id = 100000;
       emp2.getCity().add("Pune");
        System.out.println("Emp1====  " + emp1);


        System.out.println("Emp2 =======  " + emp2);

        emp2.getCity().add("Pune");
        emp2.name = "Sneha";
//
      System.out.println("Emp1  " + emp1);
//
       System.out.println("Emp2   " + emp2);
    }
}
