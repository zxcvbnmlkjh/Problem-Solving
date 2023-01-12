/**
 * https://leetcode.com/problems/truncate-sentence/description/
 * Input: s = "Hello how are you Contestant", k = 4
 * Output: "Hello how are you"
 *
 */
public class TruncateSentence
{
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        TruncateSentence truncateSentence = new TruncateSentence();
        System.out.print(truncateSentence.truncateSentence(s , 4));
    }
    public String truncateSentence(String s, int k) {
        String[] str = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<k;i++){
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();
    }
}
