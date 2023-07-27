import java.util.Comparator;

public class BookComparator implements Comparator<Book>
{

    @Override public int compare (Book o1, Book o2)
    {
        int val = o1.getId() - o2.getId();
        if(val !=0) {
            return val;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
