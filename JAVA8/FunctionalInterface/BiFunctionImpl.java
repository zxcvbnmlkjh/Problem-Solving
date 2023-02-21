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
