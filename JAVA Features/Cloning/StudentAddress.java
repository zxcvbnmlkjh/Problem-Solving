package Cloning;

public class StudentAddress implements Cloneable
{
    public int id;
    public String cityName;

    StudentAddress (int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    @Override public String toString ()
    {
        return "StudentAddress{" +
            "id=" + id +
            ", cityName='" + cityName + '\'' +
            '}';
    }

    @Override
    protected Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }
}
