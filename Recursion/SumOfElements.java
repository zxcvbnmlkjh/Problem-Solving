public class SumOfElements
{
    public static void main (String[] args)
    {
        int[] arr  = {1,2,3,4,5};
        SumOfElements sum = new SumOfElements();
        System.out.println("Sum is" + sum.findSum(arr, arr.length));
    }
    public int findSum (int[] arr, int N) {

        if(N<=0) {
            return 0;
        }
        return arr[N-1] + findSum(arr, N-1);
    }
}
