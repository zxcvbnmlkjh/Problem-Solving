/**
 * This Program will give solution to 3 problems
 *
 * 1. Find Longest Palindromic String in String
 * 2. Calculate the length of longest Palindromic String
 * 3. Return List of all Palindromic strings in the String.
 * 4. Return count of palindromic strings withing a String.
 *
 *  * Logic is we will take one character and we will travel and left nd right of that character and match
 *  * There are 2 scenarios for this problem
 *  *
 *  * 1 When you have Odd Length and 1 when you have even length
 *  *
 *  * When you have odd length we start 2 pointers from same position and
 *  * for one pointer we move towards 0 and for other pointer we move towards end.
 *  *
 *  * When we have even we take 2 variable one at i and one at i+1.
 *  * Maintain a count variable which calculates the distance between 2 pointer j-i+1.
 *
 *  https://www.youtube.com/watch?v=e9J3ntdvWyQ
 */

import java.util.HashSet;
import java.util.Set;

public class PrintAllPalindromicSubStrings
{
    public int max = Integer.MIN_VALUE;
    private String resultString;
    public static void main (String[] args)
    {
        String s = "google";
        PrintAllPalindromicSubStrings printAllPalindromicSubStrings = new PrintAllPalindromicSubStrings();
        Set<String> resultList = printAllPalindromicSubStrings.findPalindrome(s);
        for(String str : resultList) {
            System.out.print(str+ " ");
        }
        System.out.println("\n");
        System.out.println("Max length is:"+ printAllPalindromicSubStrings.max);
        System.out.println("Result String is:"+ printAllPalindromicSubStrings.resultString);
    }
    public Set<String> findPalindrome(String s) {
        Set<String> list = new HashSet<>();

        for(int i=0; i<s.length();i++) {
            isPalindrome(list,s, i, i);
            isPalindrome(list,s, i, i+1);
        }
        return list;
    }

    public void isPalindrome(Set<String> set, String str, int left, int right) {
        while((left>=0 && right<str.length()) && str.charAt(left) == str.charAt(right) ) {
            int currMax = (right-left)+1;
            if(currMax > max) {
                max = currMax;
                resultString = str.substring(left, right+1);
            }
            set.add(str.substring(left, right+1));
            left--;
            right++;
        }
    }
}
