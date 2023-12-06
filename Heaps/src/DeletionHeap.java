public class DeletionHeap
{
    public int deleteRoot (int[] arr) {
        int n = arr.length;
        int last = arr[n-1];
        n--;
        arr[0] = last;
        heapify(arr, 0, n);
        return n;
    }

    public void heapify (int [] arr, int i, int n)
    {
        int lc = (2*i)+1;
        int rc = (2*i)+2;
        int largest = i;
        if(lc<n && arr[largest]<arr[lc]) {
            largest = lc;
        }
        if(rc<n  && arr[largest] < arr[rc]) {
            largest = rc;
        }
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }

    public void print (int[] arr, int size) {
        for (int i = 0; i < size; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 12,10,6,3,5,4,1,2,11 };

        int n = arr.length;
        DeletionHeap delete = new DeletionHeap();
        int arraySize = delete.deleteRoot(arr);
        delete.print(arr, arraySize);
    }
}
