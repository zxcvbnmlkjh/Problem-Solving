import static sun.security.krb5.internal.LoginOptions.MAX;


public class InsertionHeap
{
    public int insert(int[] arr, int elem, int n) {
        n++;
        arr[n-1] = elem;
        heapify(arr, n-1);
        return n;
    }

    public void heapify (int[] arr, int n) {
        int parent = (n-1)/2;
        if(parent>=0){
            if(arr[parent] < arr[n]) {
                int temp = arr[parent];
                arr[parent] = arr[n];
                arr[n] = temp;
                heapify(arr, parent);
            }
        }
    }

    public void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        //int[] arr = {10,5,3,2,4};
        int[] arr = new int[MAX];

        // initializing some values
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
        InsertionHeap insertion = new InsertionHeap();
        insertion.insert(arr, 15, 5);
        insertion.printArray(arr);
    }
}
