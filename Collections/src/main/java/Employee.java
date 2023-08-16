public class Employee implements Comparable<Employee>
{
    private int id;

    private String name;

    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
    }

    Employee(int id, String name, String address){
            this.id = id;
            this.name = name;
            this.address = address;
    }

    @Override public int compareTo (Employee o)
    {
        int val = this.id - o.id;
        if(val != 0) {
            return val;
        }
        return  this.name.compareTo(o.name);
        //return this.name.compareTo(o.name);
        //return o.name.compareTo(this.name); // For Reverse
    }
}
