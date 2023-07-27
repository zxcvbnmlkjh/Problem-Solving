// forEach takes the Consumer interface instance as input we pass some value and don't return anything
// collect is used to collect and convert into a List

package FunctionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA8_InterviewQues
{
    public static void main (String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(e -> e>5).forEach(t -> System.out.print(t + " "));
        List<Integer> resList = list.stream().filter(e -> e<5).collect(Collectors.toList());
        System.out.println(resList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.entrySet().stream().filter(t -> t.getKey()%2==0).forEach(a -> System.out.println(a));
    }
}
