/**
 * https://leetcode.com/problems/single-number/description/?envType=featured-list&envId=top-interview-questions%3FenvType%3Dfeatured-list&envId=top-interview-questions
 *
 * every element appears twice except for one. Find that single one.
 *
 * USING XOR function.
 */
public class SingleNumber
{
    public static void main (String[] args)
    {
        int[] arr = {4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i =0;i <nums.length;i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}
