public class ReverseArray_Recursion
{
    public static void main (String[] args)
    {
        int[] arr ={1,2,3,4,5};
        ReverseArray_Recursion reverse = new ReverseArray_Recursion();
        int[] res =  reverse.reverseArray(arr,0);

        for(int i : res) {
            System.out.println(i);
        }
    }
    public static int[] reverseArray(int[] arr, int pos) {
        int [] res =new int[arr.length];
        int resPos = 0;
        if(pos == arr.length) {
            return res;
        }
        int[] r = reverseArray(arr, pos+1);
        r[resPos] = arr[pos];
        resPos++;
        return r;
    }
}
