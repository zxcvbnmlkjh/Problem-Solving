/*In this problem you need to find leftMax and RightMax element of an array and
    out of leftMax and rightMax select leftMax and multiply with value of rectangle
    This is the formula which we use for calculating the water
    Min(LeftMax, RightMax) - Width
    We will compute leftMax Array and RightMax array

    In this time complexity is O(N)
    Space Complexity - O(N) + O(N) + O(N) --> which will eventually come upto O(N)
*/
public class WaterTrappingProblem
{
    public static void main(String[] args)
    {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        WaterTrappingProblem trappingProblem = new WaterTrappingProblem();
        System.out.println("Water Saved is:"+ trappingProblem.findWater(arr));

    }
    public int findWater(int[] arr)
    {
        int sum = 0;
        int n = arr.length;
        int leftMax[] = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        rightMax[n-1] =arr[n-1];
        for(int j= n-2;j>=0;j--) {
            rightMax[j] = Math.max(rightMax[j+1], arr[j]);
        }
        for(int i=0;i<arr.length;i++) {
            sum = sum + Math.min(leftMax[i],rightMax[i]) - arr[i];
        }
        return sum;
    }
}
