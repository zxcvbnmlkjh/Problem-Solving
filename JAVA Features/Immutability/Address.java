package Immutability;

final public class Address implements Cloneable
{
    public int id;
    public String name;

    @Override public String toString ()
    {
        return "Address{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    Address(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}
