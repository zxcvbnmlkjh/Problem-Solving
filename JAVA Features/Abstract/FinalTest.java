// Final Variable -- cant be reassigned after it has been assigned once. Will get compilation error.

// Final class  --  A final class cannot be extended(inherited).
//Usage 1: One is definitely to prevent inheritance as final classes cannot be extended. For example, all
// Wrapper Classes like Integer, Float, etc. are final classes.

//Usage 2: The other use of final with classes is to create an immutable class like the predefined String class.
// One can not make a class immutable without making it final.

//Final MEthod -- A final method cannot be overridden. We must declare methods with the final keyword for which we are
// required to follow the same implementation throughout all the derived classes.


package Abstract;

public class FinalTest
{

    public static void main(String[] args) {

    }

    public void getName () {
        System.out.print("dhjshdjsdsd");
    }
}
