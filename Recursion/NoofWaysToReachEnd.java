/**
 * Count all possible paths from top left to bottom right of a mXn matrix
 * https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 *
 * when we are at last row and last coloumn to reach till end we just need 1 way. So thats the base condition
 * and we need to find for the rest of the array
 *
 * https://www.youtube.com/watch?v=46zD5d9y9b4
 *
 */

public class NoofWaysToReachEnd
{
    public static void main (String[] args)
    {
        System.out.println("No of ways: "+ findWays(4,4));
    }
    public static int findWays (int n, int m) {

        if(n==1 || m== 1) {
            return 1;
        }
        return findWays(n-1,m) + findWays(n,m-1);
    }
}
