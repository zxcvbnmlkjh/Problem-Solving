package Lambda_Representation;

/**
 * Functional interface has only 1 abstract method
 * @FunctionalInterface Annotation on top. By defaul ones are Cloneable, Runnable n all.
 */
public class FunctionalInterfaceDemoImpl
{
    public static void main (String[] args)
    {
        // This is the traditional way of calling interface and methods
            Shape s = new Rectangle();
            s.draw();
            Shape shape = new Square();
            shape.draw();

         // Lambda has reduced line of code a lot.
        // This way we need not to create separate classes.

        Shape square = () -> System.out.println("M in Square");
        square.draw();

        Shape rect = () -> System.out.println("M in Rectangle");
        rect.draw();
    }
}
