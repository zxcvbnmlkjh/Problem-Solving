public class SubArrayWithGivenSum_BruteForce
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int sum = 12;
        SubArrayWithGivenSum_BruteForce subArrayWithGivenSum = new SubArrayWithGivenSum_BruteForce();
        subArrayWithGivenSum.getIndex(arr, sum);

    }
    public void getIndex(int[] arr, int sum) {
        int cumSum = 0;
        for(int i =0;i< arr.length;i++){
            cumSum = arr[i];
            for(int j= i+1; j<arr.length;j++) {
               cumSum = cumSum+ arr[j];
               if(cumSum == sum) {
                   System.out.println("Start index is: " + i + " End index is: " + j);
               }
            }
        }
    }
}
