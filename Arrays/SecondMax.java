public class SecondMax
{
    public static void main (String[] args)
    {
        int[] arr = {10 , 10, 10};
        System.out.println(findMax(arr));
    }
    static int  findMax(int[] arr) {
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {

            if (fMax == Integer.MIN_VALUE && sMax == Integer.MIN_VALUE) {
                    fMax = arr[i];
                    sMax  = arr[i];
            }
            else if (arr[i] > fMax) {
                sMax = fMax;
                fMax = arr[i];
            }

        }
        if(fMax == sMax) {
            return -1;
        }
        return sMax;
    }
}
