package Immutability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentMain
{
    public static void main (String[] args) throws CloneNotSupportedException
    {
        Address address = new Address(1, "Home");
        List<Address> adList = new ArrayList<>();
        adList.add(address);
        List list = new ArrayList<>();
        list.add("i20");
        list.add("Swift");
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
        Student s = new Student("Priyanka", address, list, h1, adList, 1);
        System.out.println("Before ===  "+ s);
        s.getAddress().id = 1000;
        HashMap<String, String> hmTest = s.getTestMap();
        hmTest.put("4", "new");
        // This broke immutability so when we are doing getAddress we need to return cloned object instead of actual object.
        list.add("honda city");
        s.getCarList().add("honda");
        s.getAdList().get(0).name = "Test";
        //s.getAdList().add(new Address(2, "Test123"));
        // This broke immutability here thats why when we are setting values in constructor we need to copy values not reference.
        System.out.println("After Breaking Immutability  " + s);

    }
}
