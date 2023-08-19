public class RightMax
{
    public static void main (String[] args)
    {
        int[] arr = { 3, 5, 14, 6, 9, 12, 3 }; // max = 14
        RightMax rightMax = new RightMax();
        int[] res = rightMax.findMax(arr);
        for(int i : res) {
            System.out.print(i + " ");
        }
    }

    public int[] findMax (int[] arr)
    {
        int[] res= new int[arr.length];
        int max = -1; // reset
        for (int i = 0; i < arr.length; i++) { // 3
            max = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] > max) {

                    max = arr[j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}
