package Immutability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

final public class Student implements Cloneable
{

    private final String name;
    private final Address address;
    private final List<String> carList;
    private final HashMap<String,String> testMap;
    private final List<Address> adList;
    private final int id;

    public Student (
        String name,
        Address address,
        List<String> carList,
        HashMap<String, String> testMap, List<Address> adList, int id)
    {
        this.name = name;
        this.address = address;
        this.carList = carList;
        this.testMap = testMap;
        this.adList = adList;
        this.id = id;
    }

    public int getId ()
    {
        return id;
    }

    public HashMap<String, String> getTestMap ()
    {
        return (HashMap<String, String>) testMap.clone();
    }

    public List<String> getCarList ()
    {
        return new ArrayList<>(carList);
        //return carList;
    }

    public String getName ()
    {
        return name;
    }

    @Override public String toString ()
    {
        return "Student{" +
            "name='" + name + '\'' +
            ", address=" + address +
            ", carList=" + carList +
            ", testMap=" + testMap +
            ", adList=" + adList +
            ", id=" + id +
            '}';
    }

    public Address getAddress () throws CloneNotSupportedException
    {
        return (Address) address.clone();
    }

    public List<Address> getAdList ()
    {

        return adList.stream().map(address1 -> getCloneObject(address1)).collect(Collectors.toList());

       /* List<Address> tempList = new ArrayList<>();
        for(Address a : adList) {
            tempList.add((Address) a.clone());
        }
        return tempList;*/
    }

    private Address getCloneObject (Address ad) {
        try {
            return (Address) ad.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override protected Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }


}
