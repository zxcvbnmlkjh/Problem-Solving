package StreamAPiI;

import java.util.*;
import java.util.stream.Collectors;

public class EmplyeeImpl
{
    public static void main (String[] args)
    {
        EmplyeeImpl emp = new EmplyeeImpl();
        List<Employee> list = emp.getList();

        list.stream().sorted((t1,t2) -> t1.getCity().compareTo(t2.getCity())).forEach(s -> System.out.println(s));

        System.out.println("Sorted based on age=============");

        list.stream().sorted(Comparator.comparingInt(Employee :: getAge)).forEach(s -> System.out.println(s));

        System.out.println("Sorted based on age in reverse order=======");

        list.stream().sorted(Comparator.comparingInt(Employee :: getAge).reversed()).forEach(s -> System.out.println(s));

        List resiltList = list.stream().filter(s -> s.getAge()>28).collect(Collectors.toList());

        resiltList.stream().forEach(s -> System.out.println("ResultList is:"+ s));

        List<String> l = new LinkedList<>();
        l.add("pinku");
        l.add("popo");
        l.add("anku");
        l.add("vani");

        // Print Ascending

        l.stream().sorted(Comparator.naturalOrder()).forEach(s -> System.out.println(s));
        l.stream().sorted().forEach(s -> System.out.println(s));

        // Print Descending

        l.stream().sorted((t1,t2) -> t2.compareTo(t1)).forEach(s -> System.out.println("rotated in reverse "+ s));
        l.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        //String Array

        String domains[] = {"Practice", "Geeks",
            "Code", "Quiz"};

        Collections.sort(Arrays.asList(domains));   // Allows only List, if we want to pass array we need to first convert to list

        // Enhanced for loop
        for(Employee   empl: list) {
            System.out.println(empl);
        }
        //
        list.stream().forEach(e -> System.out.println(e));

        String[] arr = {"a" , "b" , "c", "d" , "e"};
        List<String> testList = Arrays.asList(arr);
        testList.stream().map(String :: toUpperCase).forEach(System.out :: println);
    }
    public List<Employee> getList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Pinku", "Acohar", 30));
        list.add(new Employee("Ankita", "GZB", 26));
        list.add(new Employee("Sneha", "Delhi", 30));
        list.add(new Employee("Abhinav", "Abohar", 27));
        return list;
    }
}
