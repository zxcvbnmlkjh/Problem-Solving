package StreamAPiI;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class GeneralOperations
{
    public static void main (String[] args)
    {
        // Iterate Over map using Streams. To print entire key Set

        Map<String, Double> missions = new HashMap<>();
        missions.put("name", 1.0);
        missions.put("name1", 2.0);
        missions.entrySet().stream().forEach(e-> System.out.println(e));


        // To print only keys

        Map<String, Double> missions1 = new HashMap<>();
        missions.put("name", 1.0);
        missions.put("name1", 2.0);
        missions.keySet().stream().forEach(e-> System.out.println(e));

        // filter the salary greater than 100

        Map<String, Integer> employeeData = new HashMap<>();
        employeeData.put("Pinku", 100);
        employeeData.put("Sneha", 200);
        employeeData.put("Vana", 300);
        employeeData.put("Anga", 400);
        employeeData.put("No", 500);
        List list = employeeData.entrySet().stream().filter(e -> e.getValue() > 100
            && e.getKey().startsWith("A") || e.getKey().startsWith("V")).collect(Collectors.toList());
        System.out.println(list);

        // Sort the data in map using keys and store data in list

        Map<String, Integer> employeeData1 = new HashMap<>();
        employeeData1.put("zaa", 1000);
        employeeData1.put("Pinku", 100);
        employeeData1.put("Sneha", 200);
        employeeData1.put("Vana", 300);
        employeeData1.put("Anga", 400);
        employeeData1.put("No", 500);

        List l = employeeData1.entrySet().stream().sorted(comparingByKey()).collect(Collectors.toList());

        System.out.println("Sorted list"+ l);

        // Adding the data to Map after sort in descending order

        Map sorted = employeeData1
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(comparingByKey()))
            .collect(
                toMap(e -> e.getKey(), e -> e.getValue(),
                    (e1,e2) -> e2, LinkedHashMap::new)
                );

        System.out.println("Sorted Map in reverse Order"+ sorted);

        // Sort Map using Values


        Map<String, Integer> employeeData2 = new HashMap<>();
        employeeData2.put("zaa", 1000);
        employeeData2.put("Pinku", 100);
        employeeData2.put("Sneha", 200);
        employeeData2.put("Vana", 300);
        employeeData2.put("Anga", 400);
        employeeData2.put("No", 500);

        List l1 = employeeData2
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(comparingByValue()))
            .collect(Collectors.toList());

        System.out.println("Sorted list using values"+ l1);

        // Sort based on Value and Store in map

        Map<String, Integer> employeeData3 = new HashMap<>();
        employeeData3.put("zaa", 1000);
        employeeData3.put("Zneha", 100);
        employeeData3.put("Pinku", 100);
        employeeData3.put("Vana", 300);
        employeeData3.put("Anga", 400);
        employeeData3.put("No", 500);

        Map finalMap = employeeData3
            .entrySet()
            .stream()
            .sorted(comparingByValue())
            .collect(toMap(e-> e.getKey() , e -> e.getValue() ,
                (e1,e2) -> e1 , LinkedHashMap::new));

        System.out.println("Final map is:"+ finalMap);

    }
}
