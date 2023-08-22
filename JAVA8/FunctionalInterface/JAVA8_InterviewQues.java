// forEach takes the Consumer interface instance as input we pass some value and don't return anything
// collect is used to collect and convert into a List

package FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JAVA8_InterviewQues
{
    public static void main (String[] args)
    {

        List<Integer> list = Arrays.asList(1, 22, 3, 4, 5, 36, 7, 81, 9, 10);

        int sum = list.stream().mapToInt(e -> e).sum();
        System.out.println("Sumlist :"+ sum);

        List<Integer> resList = list.stream().filter(e -> e<5).collect(Collectors.toList());

        System.out.println("Sorted list");
        List<Integer> sortedList  = list.stream().sorted((o1,o2) -> o1-o2).collect(Collectors.toList());

        System.out.println("Sorted list" + sortedList);
/*
        list.stream().sorted(new Comparator<Integer>()
        {
            @Override public int compare (Integer o1, Integer o2)
            {
                return o1 - o2;
            }
        });
*/


        System.out.println(resList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.entrySet().stream().filter(e-> e.getValue() == "a")
            .forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));


        map.entrySet().stream().filter(t -> t.getKey()%2==0).forEach(a -> System.out.println(a));
    }
}
