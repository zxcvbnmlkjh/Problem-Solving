package EqualsHashcode;

import java.util.Objects;

public class Test
{
    private String name;
    private String Address;

    @Override public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name) && Objects.equals(Address,
            test.Address);
    }

    @Override public int hashCode ()
    {
        return Objects.hash(name, Address);
    }
}
