import java.util.Map;
import java.util.TreeMap;

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
    }
}
