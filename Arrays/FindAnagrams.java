import java.util.Arrays;

/**
 * Create an additional array of 256 size and for first string character change everything to 1
 * For second string characters reduce the value by 1 so if strings are anagrams array should be zero.
 * TC - O(N)
 * SC - O(256) --- which will be constant --> O(1)
 */
public class FindAnagrams
{
    public static void main (String[] args)
    {
        String s1 = "silent";
        String s2 = "listen";
        FindAnagrams findAnagrams = new FindAnagrams();
        System.out.println(findAnagrams.checkAnagrams(s1,s2));
    }

    public boolean checkAnagrams (String s1, String s2) {

        // First Approach

        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        String res =  Arrays.toString(ch);;
        String res1 =  Arrays.toString(ch1);;
        return  res.equals(res1);

    }
}
