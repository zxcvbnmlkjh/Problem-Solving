/**
 * I have added getters in Parent class and getters in the child class.
 * Implemented equals and hashcode method in both classes.
 * In child class equals method added check for age and name as well in equals and hashcode both.
 */
package EqualsHashcode;

public class ClientMain
{
    public static void main (String[] args)
    {
        Employee employee = new Employee("Priyanka", 30, "SSE");
        Employee employee1 = new Employee("Priyanka",30, "SSE");

        Person person1 = new Person("xyz", 12);

        Person person2 = new Person("xyz", 12);

        boolean equalsRes = employee.equals(employee1);
        boolean objEqualRes = (employee == employee1);

        boolean personEquals = person1.equals(person2);
        boolean personObjectEquals = (person1 == person2);

        System.out.println("Equals res is:" + equalsRes);
        System.out.println("Object Equals res is:" + objEqualRes);

        System.out.println("Person Equals res is:" + personEquals);
        System.out.println("Person Object Equals res is:" + personObjectEquals);

    }
}
