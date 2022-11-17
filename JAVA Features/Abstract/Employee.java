package Abstract;

import java.util.List;

public class Employee {

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Employee(String name, String address, List<String> phoneNumbers) {
        this.name = name;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String name;

    public String address;

    public List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
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

    Employee(String name, String add) {
        this.name = name;
        this.address = add;
    }

}
