package Arrays;

public class Reverse_Array
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Reverse_Array rev = new Reverse_Array();
        int[] res = rev.reverseArray(arr);
        for(int i=0; i<res.length;i++)
        {
            System.out.print(res[i] + " ");
        }
    }

    public int[] reverseArray(int[] arr) {
        int i =0 ;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];  // 1
            arr[i] = arr[j]; //4
            arr[j] = temp; //
            i++;
            j--;
        }
        return arr;
    }
}
