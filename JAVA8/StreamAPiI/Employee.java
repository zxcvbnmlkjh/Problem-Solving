package StreamAPiI;

import java.util.Objects;

public class Employee
{
    private String name;
    private String city;
    private int age;

    @Override public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name)
            && Objects.equals(city, employee.city);
    }

    @Override public int hashCode ()
    {
        return Objects.hash(name, city, age);
    }

    @Override public String toString ()
    {
        return "Employee{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            ", age=" + age +
            '}';
    }

    Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }
}
