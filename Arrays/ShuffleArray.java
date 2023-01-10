public class ShuffleArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;
        ShuffleArray shuffleArray = new ShuffleArray();
        int[] res = shuffleArray.shuffle(arr, n);
       for(int i=0;i<res.length;i++) {
           System.out.print(res[i]);
       }
    }

    public int[] shuffle(int[] nums, int n)
    {
        int[] arr = new int[nums.length];  // 1,4,2,3,3,2,4,1
        System.out.println("nums length is:" + nums.length);
        int i=0;
        int j = n;  //4
        int p=0;
        while(j<nums.length)
        {
            System.out.println("First value"+ nums[i]);
            System.out.println("Second value:" + nums[j]);
            arr[p] = nums[i];
            arr[p+1] = nums[j];
            p = p+2;
            i++;
            j++;
        }
        return arr;
    }
}
