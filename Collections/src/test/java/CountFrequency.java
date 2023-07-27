import java.util.*;
import java.util.stream.Collectors;

public class CountFrequency
{
    public static void main (String[] args)
    {
        String s = "bhagvadgita";
        CountFrequency c = new CountFrequency();
        c.findFrequency(s.toCharArray());
    }
    private void findFrequency(char[] ch) {
        Comparator<Map.Entry<Character, Integer>> comp = (c1 , c2) -> c1.getValue() - c2.getValue();

        Map<Character, Integer> map = new HashMap();
        for(char c : ch) {
            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }

        // One way to print

       /* for(Map.Entry entry : map.entrySet()) {
            System.out.println("Key is  "+ entry.getKey() + "  Value is  " + entry.getValue());
        }*/

        // Second way to print

        map.forEach((key, value) -> System.out.println("key is====  " + key + "  Value is  " + value));

        /*List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        list.forEach((obj) -> System.out.println(obj.getKey() + "      " + obj.getValue()));
*/

        Map<Character, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        for(Map.Entry entry : sortedMap.entrySet()) {
            System.out.println("Key is  "+ entry.getKey() + "  Value is  " + entry.getValue());
        }
    }
}
