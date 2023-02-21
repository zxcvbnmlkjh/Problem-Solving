package FunctionalInterface;

import java.util.function.Function;

/**
 * Function is a func interface which take 2 params
 * one type of I/P
 * second type of O/P
 * It has abstract method as apply()
 */
public class FunctionFunctionalInterface
{
    public static void main (String[] args)
    {
        //Function<Integer, String> func = (a) -> Integer.toString(a);
        Function<Integer, String> func = (a) -> Integer.toString(a);
        System.out.print(func.apply(2));

        // Map uses fucntion as parameter and map we use to convert object from one form to another.
    }
}
