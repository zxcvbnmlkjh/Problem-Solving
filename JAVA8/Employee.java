public class Employee implements Cloneable
{
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
