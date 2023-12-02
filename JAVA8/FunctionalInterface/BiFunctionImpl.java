/**
 * BiFunction is a functional interface, which accepts two arguments and returns a result. The interface contains two methods:
 *
 * The apply() method
 * The andThen() method
 */
package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionImpl
{
    public static void main (String[] args)
    {
        BiFunction<Integer,Integer,Integer> bifunc = (a,b) -> a*b;
        System.out.println(bifunc.apply(4,5));
    }
}
