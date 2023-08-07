/**
 * This we can find using recursion and for optimization we can use DP.
 */

public class PerfectSquare
{
    public static void main (String[] args)
    {
        System.out.println(numSquares(12));
    }
        public static int numSquares(int n) {
            int dp[] = new int[n+1];
            return find(n,dp);
        }

        public static int find(int n,int dp[]){
            if(n == 1 || n == 0){
                return n;
            }
            if(dp[n] != 0){
                return dp[n];
            }
            int mini = Integer.MAX_VALUE;
            for(int i = 1; i*i <= n ; i++){
                int temp = find(n - (i*i),dp);
                mini = Math.min(mini,temp);
            }
            dp[n] = mini+1;
            return mini+1;
        }
    }
