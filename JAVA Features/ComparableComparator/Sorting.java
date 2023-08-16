package ComparableComparator;

import java.util.*;

public class Sorting
{
    public static void main (String[] args)
    {
        String[] nameList = {"Priyanka", "Naina", "test", "aaree"};
        Arrays.sort(nameList);
        for(String name : nameList) {
            System.out.println(name);
        }
        List<Integer> list = Arrays.asList(11,23,12,222);
        Collections.sort(list);
        System.out.println(list);

        List<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);
    }
}
