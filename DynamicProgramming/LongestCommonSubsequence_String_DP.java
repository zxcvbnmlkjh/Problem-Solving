
/**
 * For two strings we need to find common longest subsequence. It should follow the order of characters.
 *
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */

import java.util.Scanner;

public class LongestCommonSubsequence_String_DP
{
    public static void main(String[] args) {
        LongestCommonSubsequence_String_DP longestCommonSubsequence_stringDP = new LongestCommonSubsequence_String_DP();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();
        int[][] dp = new int[str1.length()+1][str2.length()+1];

        for(int i=1;i<=str1.length();i++) {
            for(int j=1; j<= str2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Longest sequence is " +
            longestCommonSubsequence_stringDP.longestCommonSubsequence_DP(str1.length(),
                str2.length(), str1.toCharArray(), str2.toCharArray(), dp));

        longestCommonSubsequence_stringDP.printMatrix(dp);

    }

    public int longestCommonSubsequence_DP(int m, int n, char[] ch1, char[] ch2, int[][] dp) {

        if(m == 0 || n == 0) {
            return 0;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        if(ch1[m-1] == ch2[n-1])
        {
            dp[m][n] = 1+ longestCommonSubsequence_DP(m-1, n-1, ch1, ch2, dp);
            return dp[m][n];
        } else {
            dp[m][n] = Math.max(longestCommonSubsequence_DP(m-1, n , ch1, ch2, dp) ,
                longestCommonSubsequence_DP(m, n-1, ch1, ch2, dp));
            return dp[m][n];
        }
    }

    public void printMatrix(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0 ;j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
