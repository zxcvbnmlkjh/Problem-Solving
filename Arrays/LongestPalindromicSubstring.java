/**
 * Logic is we will take one character and we will travel and left nd right of that character and match
 * There are 2 scenarios for this problem
 *
 * 1 When you have Odd Length and 1 when you have even length
 *
 * When you have odd length we start 2 pointers from same position and
 * for one pointer we move towards 0 and for other pointer we move towards end.
 *
 * When we have even we take 2 variable one at i and one at i+1.
 * Maintain a count variable which calculates the distance between 2 pointer j-i+1.
 */
public class LongestPalindromicSubstring
{
    public static void main (String[] args)
    {
        System.out.println("Length of longest string is:" + longestPalindrome("babad"));
    }
    public static String longestPalindrome(String A) {
            int ans = 0;
            String sc = "";
            int start = 0;
            int end = 0;

            for(int i = 0 ; i < A.length() ; i++){
                int p1 = i;
                int p2 = i;
                int temp = expands(A,p1,p2);
                if(temp > ans){
                    ans = temp;
                    start = i-(ans/2);
                    end = i+(ans/2);
                }
            }

            for(int i = 0 ; i < A.length() ; i++){
                int p1 = i;
                int p2 = i+1;
                if(expands(A,p1,p2) > ans){
                    ans = expands(A,p1,p2);
                    start = i-((ans/2)-1);
                    end = i+1+((ans/2)-1);
                }
            }
            StringBuilder ansString = new StringBuilder();

            for(int i = start ; i <= end ; i++){
                ansString.append(A.charAt(i));
            }
            return ansString.toString();
        }

        public static int expands(String A, int p1, int p2) {
            int ans = 0;
            while(p1 >= 0 && p2 <= A.length()-1 && A.charAt(p1) == A.charAt(p2)){
                ans = p2-p1+1;
                p1--;
                p2++;
            }
            return ans;
        }
    }
