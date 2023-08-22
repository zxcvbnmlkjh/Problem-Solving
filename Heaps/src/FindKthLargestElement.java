// First we create a max heap from normal Array. Representation of heap is nothing
// but an Array which follows heap's properties that the root element should be greater than the child nodes.

// After creating the maxHeap we remove the top for k-1 times and Next time kth element will be our Kth Largest element.
public class FindKthLargestElement
{
    int len = 0;
    public int findKthLargest(int[] arr, int k) {
        int i = 1;
        len = arr.length;
        while(i< k) {
            delete(arr, len);
            i++;
        }
        return arr[0];
    }

    public void createMaxHeap (int[] arr) {
        int n = arr.length-1;
        for(int i = n; i>=0; i--)
        {
            heapify(arr, i, arr.length);
        }
    }

    public void delete (int[] arr, int len) {
        //len = arr.length;
        arr[0] = arr[len-1];
        arr[len-1] = Integer.MIN_VALUE;
        len--;
        heapify(arr,0 , len);
    }


    public void heapify (int[] arr, int i , int len) {

        //int len = arr.length;
        int lc = (2*i)+1;
        int rc = (2*i)+2;
        int maxElem = i;
        if(lc<=len-1 && arr[lc] > arr[maxElem]) {
            maxElem = lc;
        }
        if(rc<=len-1 && arr[rc] > arr[maxElem]) {
            maxElem = rc;
        }
        if(maxElem != i){
            int temp = arr[i];
            arr[i] = arr[maxElem];
            arr[maxElem] = temp;
            heapify(arr, maxElem, len);
        }
    }

    public void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {-1,2,0};

        FindKthLargestElement element = new FindKthLargestElement();
        element.createMaxHeap(arr);
        element.printArr(arr);
        System.out.println("Result is:"+ element.findKthLargest(arr, 3));
    }
}
