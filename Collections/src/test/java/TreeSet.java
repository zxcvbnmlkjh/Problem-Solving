import java.sql.Array;
import java.util.*;

public class TreeSet
{
    public static void main (String[] args)
    {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 2);
        treeMap.put(2, 3);
        treeMap.put(3, 3);
        treeMap.put(4, 1);
        int max= Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if(entry.getValue()>max) {
                res = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println(res);

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);

        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);

        Set<List<Integer>> set = new HashSet<>();
        set.add(list);
        set.add(list1);
        set.add(list2);

        System.out.println("Set is==== "+ set);

    }
}
