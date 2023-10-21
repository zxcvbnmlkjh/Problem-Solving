package ObjectPool;

import java.util.Objects;

public class Personn
{
    private int id;
    private String name;
    private String address;

    Personn (int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Personn person = (Personn) o;
        return id == person.id && name.equals(person.name) && address.equals(person.address);
    }

    @Override public int hashCode ()
    {
        return Objects.hash(id, name, address);
    }

    @Override public String toString ()
    {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
