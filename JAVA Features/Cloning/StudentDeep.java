/**
 * Here we are performing the Deep clone where we are cloning address object separately and adding it to object.
 */
package Cloning;

public class StudentDeep implements Cloneable
{
    public int id;
    public String name;
    public StudentAddress address;

    StudentDeep (int id, String name, StudentAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override public String toString ()
    {
        return "StudentDeep{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address=" + address +
            '}';
    }

    @Override
    protected Object clone () throws CloneNotSupportedException
    {
        StudentDeep studentDeep = (StudentDeep) super.clone();
        studentDeep.address = (StudentAddress) studentDeep.address.clone();
        return studentDeep;
    }
}
