package Optional;

import java.util.Optional;
import java.util.function.Predicate;

public class FilterMethod
{
    public static void main (String[] args)
    {
        Optional<String> op = Optional.of("Priyanka Taneja");
        op.filter(str -> str.contains("Priya")).ifPresent(s -> System.out.println("This is my name "+ s));
    }
}
