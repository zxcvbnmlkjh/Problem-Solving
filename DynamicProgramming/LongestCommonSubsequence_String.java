import java.util.Scanner;

/**
 * For two strings we need to find common longest subsequence. It should follow the order of characters.
 *
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */

public class LongestCommonSubsequence_String
{
    public static void main(String[] args) {
        LongestCommonSubsequence_String longestCommonSubsequence_string = new LongestCommonSubsequence_String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();
        System.out.println("Longest sequence is " +
            longestCommonSubsequence_string.longestCommonSubsequence(str1.length(),
            str2.length(), str1.toCharArray(), str2.toCharArray()));
    }

    public int longestCommonSubsequence(int m, int n, char[] ch1, char[] ch2) {

        if(m == 0 || n == 0) {
            return 0;
        }
        if(ch1[m-1] == ch2[n-1]) {
            return 1+ longestCommonSubsequence(m-1, n-1, ch1, ch2);
        } else {
            return Math.max(longestCommonSubsequence(m-1, n , ch1, ch2) , longestCommonSubsequence(m, n-1, ch1, ch2));
        }
    }
}
