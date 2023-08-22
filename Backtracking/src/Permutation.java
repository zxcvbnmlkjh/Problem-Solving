import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3};
        Permutation permutation = new Permutation();
        List<int[]> resList =  new ArrayList<>();
        permutation.getPermutation(0, arr, resList);

        for(int[] arr1 : resList) {
            for(int i : arr1) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        System.out.println("List size:"+ resList.size());

    }
    public void getPermutation (int index, int[] arr , List<int[]> resList) {

        if(index == arr.length){
           int[] res = Arrays.copyOf(arr, arr.length);
            resList.add(res);
            return;
        }
        for(int j = index; j< arr.length; j ++)  {
            swap(arr, index, j);
            getPermutation(index+1, arr, resList);
            swap(arr, index, j);
        }
    }

    public void swap (int[] arr, int index, int j) {
        int temp = arr[j];
        arr[j] = arr[index];
        arr[index] = temp;
    }
}
