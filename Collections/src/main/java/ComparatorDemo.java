import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo
{
    public static void main (String[] args)
    {
        Book book1 = new Book(99, "Atomic", "Pinku");
        Book book2 = new Book(59, "Secret", "Linda");
        Book book3 = new Book(79, "Growth", "Megha");
        Book book4 = new Book(99, "Happiness", "Jay");
        Book book5 = new Book(43, "Peace", "Peace");
        Book book6 = new Book(39, "Growth", "Megha");

        List<Book> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        System.out.println("BookList" + booksList);

        // Commenting traditional wayyy

        /*Collections.sort(booksList, new BookComparator());
        System.out.println("Sorted BookList" + booksList);*/


        // Implement Similar thing using Lambda

        Comparator<Book> comp = (Book b1 , Book b2)-> b1.getName().compareTo(b2.getName());

        Collections.sort(booksList, comp.reversed()); // Reverse

        System.out.println("Sorted BookList" + booksList);

       /* Comparator<Book> comp1 = ( b1 ,  b2) ->
            b1.getId()-b2.getId() != 0 ? b1.getId()-b2.getId() : b1.getName().compareTo(b2.getName());

        Collections.sort(booksList, comp1);
        System.out.println("Sorted BookList" + booksList);*/

        Collections.sort(booksList, (b1, b2) -> b1.getName().compareTo(b2.getName()) !=0
            ? b1.getName().compareTo(b2.getName()) : b1.getId() - b2.getId());

        System.out.println("Sorted BookList" + booksList);
    }
}
