import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateMaxHeap
{
    public void createMaxHeap (int[] arr) {
        int n = arr.length-1;
        for(int i = n; i>=0; i--)
        {
            heapify(arr, i);
        }
    }

    public void heapify(int[] arr, int i) {
        int len = arr.length;
        int lc = (2*i)+1;
        int rc = (2*i)+2;
        int largest = i;
        if(lc<= len-1 && arr[lc] > arr[largest]) {
            largest = lc;
        }
        if(rc<= len-1 && arr[rc] > arr[largest]) {
            largest = rc;
        }
        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, largest);
        }
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,6};
        CreateMaxHeap createMaxHeap = new CreateMaxHeap();
        createMaxHeap.createMaxHeap(arr);
        createMaxHeap.printArr(arr);

        Map map = new HashMap<>();
        Set set = map.entrySet();

    }
}
