public class CreateMinHeap
{
    public void createMinHeap (int[] arr)
    {
        int n = arr.length-1;
        for(int i = n; i>=0; i--)
        {
            heapify(arr, i);
        }
    }

    public void heapify (int[] arr, int i) {
            int lc = (2*i)+1;
            int rc = (2*i)+2;
            int smallest = i;
            if(lc <= arr.length-1 && arr[lc] < arr[i]) {
                smallest = lc;
            }
            if(rc <= arr.length-1 && arr[smallest]> arr[rc]) {
                smallest = rc;
            }
            if(smallest != i) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
                heapify(arr, smallest);
            }
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 9,7,3};
        CreateMinHeap createMinHeap = new CreateMinHeap();
        createMinHeap.createMinHeap(arr);
        createMinHeap.printArr(arr);
    }
}
