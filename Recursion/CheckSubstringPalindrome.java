/**
 * Given a SubString, Check if it is palindrome or not using Recursion??
 * gooddad // dad is palindrome
 *
 * Solution is - If a String is palindrome, its substring will also be palindrome
 * so going with that assumption what ever index we get we apply the normal two pointer approach.
 * MADAM
 * ADA
 *
 */

public class CheckSubstringPalindrome
{
    public static void main (String[] args)
    {
        String str = "malayalam";
        CheckSubstringPalindrome check = new CheckSubstringPalindrome();
        System.out.println(check.checkPalindrome(str.toCharArray(), 1,7));

    }
    public boolean checkPalindrome(char[] ch, int start, int end) {

        // This will be true because when start is greater than end that means we dont
        // have any substring or substrin is empty , so empty string is alway palindrome
        if(start > end) {
            return true;
        }

        if(ch[start] == ch[end] && checkPalindrome(ch, start+1, end-1)){
            return true;
        }
        return false;
    }
}
