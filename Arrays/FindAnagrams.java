import java.util.Arrays;

/**
 * Create an additional array of 256 size and for first string character change everything to 1
 * For second string characters reduce the value by 1 so if strings are anagrams array should be zero.
 * TC - O(N)
 * SC - O(256) --- which will be constant --> O(1)
 *
 * Assigning character to integer value will give the ascii value of it.
 */
public class FindAnagrams
{
    public static void main (String[] args)
    {
        String s1 = "silent";
        String s2 = "listen";
        FindAnagrams findAnagrams = new FindAnagrams();
        System.out.println(findAnagrams.checkAnagrams(s1,s2));

        s1 ="pinku";
        s2 ="kunpi";
        System.out.println(findAnagrams.findAnagram2(s1,s2));

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

    // Second Approach

    public boolean findAnagram2 (String s1, String s2) {
        int[] arr = new int[256];
        Arrays.fill(arr, 0);
        for(char ch : s1.toCharArray()) {
            int val = ch;
            System.out.println("Charatcer is:" + val );
            arr[ch]++;
        }
        for(char ch : s2.toCharArray()) {
            arr[ch]--;
        }
        for(int i : arr) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
