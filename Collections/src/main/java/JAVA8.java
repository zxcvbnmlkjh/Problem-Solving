import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA8
{
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 70);
        map.put("b", 30);
        map.put("c", 50);
        map.put("d", 40);
        map.put("e", 10);
        map.put("z", 60);
        map.put("g", 110);
        map.put("h", 50);
        map.put("i", 90);

        // For Primitive Datatypess

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


       /* map.entrySet().stream().sorted(
            (Comparator<? super Map.Entry<String, Integer>>) Map.Entry.comparingByKey().reversed()).forEach(System.out::println);
*/
        HashMap<String, Employee> hashMapObj = new HashMap<>();
        hashMapObj.put("a", new Employee(1, "Priyanka", "Abohar"));
        hashMapObj.put("b", new Employee(2, "Sneha", "Delhi"));
        hashMapObj.put("d", new Employee(3, "Angi", "Gzb"));
        hashMapObj.put("c", new Employee(4, "Sumit", "Calcutta"));

        // For Object DataType Sort by Key

       hashMapObj.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByKey())
           .forEach(System.out::println);

       // Sort by value

        hashMapObj.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
            .forEach(System.out::println);

        hashMapObj.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAddress).reversed()))
            .forEach(System.out::println);

        System.out.println("Stored in new hashmap");

        // Store result into new HashMap
        final Map<String, Employee> sortedByObj = hashMapObj.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAddress)))
            .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByObj);
    }
}
