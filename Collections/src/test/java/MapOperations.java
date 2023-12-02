import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOperations
{
    public static void main (String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("Priyanka", "Taneja");
        map.put("Sneha", "Bathla");
        map.put("Ankita", "Bathla");
        map.put("Vani", "Taneja");
        map.put("Abhinav", "Taneja");


        map.forEach((K,V) -> System.out.println(K + " " + V));

        System.out.println("Sorted List");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);




    }
}
