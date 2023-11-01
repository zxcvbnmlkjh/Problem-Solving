/**
 * 	1. In max heap we know top element is max so we copied the top element and stored it in resultList.
 * 	2. Swap Last element with top element
 * 	3. Reduce the array size by 1
 * 	4. Perform Heapify function again on the top.
 * Keep doing this till the array size left is 1.
 */
public class HeapSort
{
    public static void main (String[] args)
    {
        int[] arr = {3,2,3,1,2,4,5,6};
        HeapSort heapSort = new HeapSort();
        heapSort.createMaxHeap(arr);
        heapSort.printArr(arr);
        heapSort.sort(arr);
        heapSort.printArr(arr);
    }

    public void createMaxHeap (int[] arr) {
        int n = arr.length;
        for(int i = n; i>=0; i--)
        {
            heapify(arr, i, n);
        }
    }

    public void heapify(int[] arr, int i, int len) {
        //int len = arr.length;
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
            heapify(arr, largest, len);
        }
    }

    public void sort (int[] arr) {
        for(int i=arr.length-1 ; i>0 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
