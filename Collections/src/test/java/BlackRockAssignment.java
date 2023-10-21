import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class BlackRockAssignment
{
    public static void main (String[] args)
    {
        List categoryList = Arrays.asList(1,2,3,3);
        List priceList = Arrays.asList(1,4,2,4);

        List<Integer> list = Arrays.asList(3,5,2,12,55,34,12,89,32,1);
        BlackRockAssignment blackRockAssignment = new BlackRockAssignment();
        blackRockAssignment.findMaxProfit(categoryList, priceList);

       List<Integer> resList = list.stream().filter(a -> a%2 == 0).collect(Collectors.toList());

       System.out.println(resList);

       Employee emp1 = new Employee(1, "Priyanka", "Bangalore");
        Employee emp2 = new Employee(2, "Priyanka", "Delhi");
        Employee emp3 = new Employee(3, "Priyanka", "Aboharh");

        Map<Integer, Employee> empmap = new HashMap<>();
        empmap.put(1, emp1);
        empmap.put(2, emp2);
        empmap.put(3, emp3);


       Map resMap = empmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAddress)))
            .collect(Collectors.toMap(e -> e.getKey() , e-> e.getValue()));

        resMap.forEach((K,V) -> System.out.println(K + "==== " + V));
    }
    public void findMaxProfit (List<Integer> categoryList, List<Integer> priceList) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int k = 0;
        for(Integer i : priceList) {
            if(map.get(i) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(categoryList.get(k));
                map.put(i, list);
            } else {
                List<Integer> list = map.get(i);
                list.add(categoryList.get(k));
                map.put(i, list);
            }
            k++;
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        int count = 1;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
        }


        map.forEach((K,V) -> System.out.println(K + " " +V));





    }
}
