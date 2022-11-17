//Use of Filter and for Each

// Filter takes predicate as arguments which does conditional check

// For Each takes consumer object and consumer object doent return anything

    package Abstract;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class TestAbstract {
    public static void main(String[] args) {
        Car car = new KIA();
        car.buy();

        List<Integer> list = Arrays.asList(112,233,211,1,2,3,4);

        List<Employee> emplist = new ArrayList<>();

        for(Integer s : list){
            System.out.println(s);
        }

        //Find max with reduce

           int res = list.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Sum is===:" + res);

        //Find max with map

        int resultSum = list.stream().mapToInt(i -> i).sum();
        System.out.println("Sum is===:" + resultSum);

        list.stream().forEach(t -> System.out.println("List value is:"+ t));
        list.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t));

        list.stream().sorted().forEach(t -> System.out.println(t));
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

        List<String> phonenumber = new ArrayList<>();
        phonenumber.add("222323");
        phonenumber.add("2323111");
        Employee emp = new Employee("Priyanka", "Abojhar", phonenumber);
        Employee emp1 = new Employee("Vani", "Delhi", phonenumber);
        Employee emp3 = new Employee("Ajdkjsd", "Chandigarh", phonenumber);
        emplist.add(emp);
        emplist.add(emp1);
        emplist.add(emp3);

        // Map Transformation

        List<String> mapResult = emplist.stream().map(customer -> customer.getAddress()).collect(Collectors.toList());

        System.out.println("Map value is"+ mapResult);

        // FlatMap Transformation

        List<String> flatMapResult = emplist.stream()
            .flatMap(customer -> customer.getPhoneNumbers().stream())
            .collect(Collectors.toList());

        System.out.println("Flat Map value is"+ flatMapResult);

        // Sorting Operations

        Collections.sort(emplist, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getAddress().compareTo(o1.getAddress());
            }
        });

        // With Lambda Expression
        Collections.sort(emplist, (o1, o2) -> o2.getAddress().compareTo(o1.getAddress()));

        // With Stream API

        System.out.println("After sorting:"+ emplist);

        emplist.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(System.out::println);

       // System.out.println("After sorting:"+ emplist);

       Map<Integer, String> map = new HashMap<>();
        map.put(1, "Priyanka");
        map.put(2, "Assdsds");
        map.forEach((key,value) -> System.out.println(key + ": " + value));

        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        List<Map.Entry<Integer,String>> list1 = new ArrayList<>(map.entrySet());


        Collections.sort(list1, (o1, o2) ->  o2.getKey() - o1.getKey());

        System.out.println("After Sorting:"+ list1);

        map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);

        map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

        Map<Employee, Integer> map1 = new HashMap<>();

        map1.put(emp, 1);
        map1.put(emp1, 2);
        map1.put(emp3, 3);

        // Map Processing with comparator

        map1.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Employee::getName)
            .reversed())).forEach(System.out::println);

        map1.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);


    }
}
