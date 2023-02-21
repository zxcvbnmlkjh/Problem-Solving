/**
 * To avoid Null pointer exception JAVA8 introduced Optional class in java8.
 * Optional is a container object
 *  It can help in writing a neat code without using too many null checks.
 */
package Optional;

import java.util.Optional;

public class OptionalDemo
{
    public static void main (String[] args)
    {
        String name = "Priyanka Taneja";

        Optional op = Optional.of(name);  // Will create an optional object with String name. We can fetch value using get.
        // of method will not work with null object.
        // To create optional object with null value we need to use ofNullable.

        System.out.println(op);  // Optional[Priyanka Taneja]

        Optional emp = Optional.empty(); // Will create an empty optional object.
        System.out.println(emp);  // Optional.empty

        System.out.println(Optional.ofNullable(name)); // Optional[Priyanka Taneja]

        String[] words = new String[10];
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);  // Of method will trow NPE if we try to assign null value to it
     if (checkNull.isPresent()) {       // isPresent() will return boolean
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else {
            System.out.println("word is null");
        }

        String str = "gfddfghjhjkh";
        Optional<String> checkOp = Optional.ofNullable(str);
        checkOp.ifPresent((s) -> System.out.print(s));

}
    }

