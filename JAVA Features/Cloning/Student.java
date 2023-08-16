package Cloning;

public class Student implements Cloneable

{
    private int id;
    public String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override public String toString ()
    {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}
