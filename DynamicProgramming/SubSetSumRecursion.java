public class SubSetSumRecursion
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,1};
        int Sum = 13;
        SubSetSumRecursion subSetSumRecursion = new SubSetSumRecursion();
        System.out.print("Subset sum exists: " + subSetSumRecursion.checkSubSetSum(arr, arr.length, Sum));
    }
    public boolean checkSubSetSum (int[] arr, int n, int sum)
    {
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }
        if(arr[n-1]>sum) {
            return checkSubSetSum(arr, n-1, sum);
        } else {
            return checkSubSetSum(arr, n-1, sum-arr[n-1]) || checkSubSetSum(arr, n-1, sum);
        }
    }

}
