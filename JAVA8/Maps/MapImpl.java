/**
 * Map is used to convert value from one form to another
 */

package Maps;

import java.util.Optional;
import java.util.function.Function;

public class MapImpl
{
    public static void main (String[] args)
    {
        String str = " qqa ";
        Function f = (s) -> str.trim();
        System.out.println(f.apply(str));

        // Using Map
        Optional<String> op = Optional.of(str);
        op.filter(s -> s.contains("a")).map(String::trim).ifPresent(s-> System.out.println(s));

    }
}
