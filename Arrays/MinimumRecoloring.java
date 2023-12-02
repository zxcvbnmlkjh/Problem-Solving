import java.util.Arrays;

/**
 *
 * How many Minimum Recolors to Get K Consecutive Black Blocks ???
 * Input: blocks = "WBBWWBBWBW", k = 7  Output: 3
 */

public class MinimumRecoloring
{
    public static void main (String[] args)
    {
        String inputStr = "WBBWWBBWBW";
        MinimumRecoloring minColor = new MinimumRecoloring();
        int res = minColor.findMinRecolor(inputStr, 7);
        System.out.println("Result is "+ res);
    }
    public int findMinRecolor (String inputStr, int size) {

        char [] ch = inputStr.toCharArray();
        int minCount = 0;
        int resCount = Integer.MAX_VALUE;
        for( int i=0; i<size; i++) {
            if(ch[i] == 'W') {
                minCount ++;
            }
        }
        resCount = Math.min(resCount, minCount);
        int k =0 ;
        for(int q = size; q < ch.length; q++) {

            if(ch[k] == 'B' && ch[q] == 'W') {
                minCount++;
            }
            if(ch[k] == 'W' && ch[q] == 'B') {
                minCount--;
            }
            resCount = Math.min(resCount, minCount);
            k++;
        }
        return resCount;
    }
}
