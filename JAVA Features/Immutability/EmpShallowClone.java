/**
 * Employee Shallow Cloning
 *
 */
package Immutability;

import java.util.ArrayList;
import java.util.List;

public class EmpShallowClone implements Cloneable
{
    public String name;
    private int id;
    private List<String> city;
    private Address address;

    @Override public String toString ()
    {
        return "EmpShallowClone{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", city=" + city +
            ", address=" + address +
            '}';
    }

    public EmpShallowClone (String name, int id, List<String> city, Address add)
    {
        this.name = name;
        this.id = id;
        this.city = city;
        this.address = add;
    }

    public String getName ()
    {
        return name;
    }

    public int getId ()
    {
        return id;
    }

    public List<String> getCity ()
    {
        return new ArrayList<>(city);
    }

    public Address getAddress ()
    {
        return address;
    }

    @Override protected Object clone () throws CloneNotSupportedException
    {
        // Here we are doing deep cloning.
        /*EmpShallowClone emp = (EmpShallowClone) super.clone();
        emp.city = new ArrayList<>(city);
        emp.address = (Address) address.clone();
        return emp;*/
        return super.clone();
    }
}
