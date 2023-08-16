/**
 * Immutable emans once you create the object you wont be able to change the state of that object.
 * 1. Make class as final so that no one can overide it.
 * 2. make variables as private and final so that we cant change the value of variables.
 * 3. Provide only getters no setters should be there.
 * 4. Create object through constructor.
 *
 */
package Immutability;

import java.util.List;
import java.util.Objects;

final public class Employee
{
    private final String name;
    private final Integer rollNo;
    private final Address address;

    Employee(String name, Integer rollNo, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public String getName ()
    {
        return name;
    }

    public Integer getRollNo ()
    {
        return rollNo;
    }


    public Address getAddress () throws CloneNotSupportedException
    {
        return (Address) address.clone();
    }

    @Override public String toString ()
    {
        return "Employee{" +
            "name='" + name + '\'' +
            ", rollNo=" + rollNo +
            ", address=" + address +
            '}';
    }


}
