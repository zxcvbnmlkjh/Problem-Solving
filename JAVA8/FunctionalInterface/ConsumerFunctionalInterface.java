package FunctionalInterface;

import java.util.function.Consumer;

/**
 * Consumer Functional interface  accepts 1 parameter and return 0 parameter.
 * this interface has accept method which accept one param
 * return nothing.
 * This method is mainly for printing something.
 */
public class ConsumerFunctionalInterface
{
    public static void main (String[] args)
    {
        Consumer cons = (name) -> System.out.print(name);
        cons.accept("Priyanka");
        cons.accept(1);

        // ForEach Method uses Consumer as parameter and we use ForEach for printing.
    }
}
