package ComparableComparator;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray
{
    public static void main (String[] args)
    {
        Character[] arr = {'a', 'b', 'b', 'c', 'b', 'a', 'b', 'c', 'a'};

        Arrays.sort(arr, Collections.reverseOrder());

        for(char c : arr) {
            System.out.print(c + " ");
        }
    }
}
