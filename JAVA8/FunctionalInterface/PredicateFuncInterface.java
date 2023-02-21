/**
 * In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean.
 * Predicate has a method called test which returns boolean value.
 * filter() accepts predicate as argument.
 * ifPresent accepts Consumer functional interface.
 *
 * https://mkyong.com/java8/java-8-predicate-examples/
 *
 */
package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PredicateFuncInterface
{
    public static void main (String[] args)
    {
        Optional<String> op = Optional.of("Priyanka");
        op.filter(s -> s.contains("Pri")).ifPresent(s -> System.out.print(s));

        //  Predicate in filter()

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]

        // Filter method uses predicate it will return boolean value.
    }
}
