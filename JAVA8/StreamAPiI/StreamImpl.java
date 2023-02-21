/**
 * Introduced in Java 8, the Stream API is used to process collections of objects.
 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 */
package StreamAPiI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImpl
{
    public static void main (String[] args)
    {
        List<String> list = Arrays.asList("Priyanka", "Vani", "POPO");
        list.stream().forEach(s -> System.out.println(s));

        // There are different methods with stream
        /**
         * Intermediate Operation
         * 2. map
         * 3. filter
         * 4. Sorted
         * Terminal Operation
         * 1. Collect
         * 2. forEach
         * 3. reduce
         */

        List<String> list2 = Arrays.asList("JAVA", "C++", "Python");
        Stream<String> stream = list2.stream();
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        set.stream().forEach(System.out :: println);

        String[] strArray = {"ab" , "bc", "de"};

        System.out.println(list2.stream().sorted().collect(Collectors.toList()));


    }
}
