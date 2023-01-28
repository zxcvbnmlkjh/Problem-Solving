public class SortArrayByParity
{
    public static void main(String[] args) {
        int[] nums = {3,1,2,7};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] result = sortArrayByParity.sortArrayByParity(nums);
        for(int i :result) {
            System.out.println(i);
        }
    }
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}
