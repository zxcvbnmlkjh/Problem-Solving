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
    @Override public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return rollNo == employee.rollNo && Objects.equals(name, employee.name)
            && Objects.equals(addressList, employee.addressList);
    }

    @Override public int hashCode ()
    {
        return Objects.hash(name, rollNo, addressList);
    }

    public String name;
    private int rollNo;
    private List<String> addressList;

    Employee(String name, int rollNo, List addressList) {
        this.name = name;
        this.rollNo = rollNo;
        this.addressList = addressList;
    }

    public String getName ()
    {
        return name;
    }

    public int getRollNo ()
    {
        return rollNo;
    }

    public List<String> getAddressList ()
    {
        return addressList;
    }
}
