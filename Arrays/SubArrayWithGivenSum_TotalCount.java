import java.util.HashMap;

public class SubArrayWithGivenSum_TotalCount
{
    public static void main(String[] args) {
        int[] arr ={4,5,1,3,2,3,4};
        int k = 9;
        SubArrayWithGivenSum_TotalCount subArrayWithGivenSum_totalCount = new SubArrayWithGivenSum_TotalCount();
        System.out.println("No of count is   "+ subArrayWithGivenSum_totalCount.totalCount(arr, k));
    }

    public int totalCount(int[] arr, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0 ;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
                sum = sum + arr[i];
            int temp = sum - k;
            if(sum == k) {
                count++;
            }
            if(map.containsKey(temp)) {
                count++;
                map.put(sum, count);
               /* count += map.get(temp);
                map.put(temp, map.get(temp)+1);*/
            } else {
                map.put(sum, count);
            }
        }
        return count;
    }
}
