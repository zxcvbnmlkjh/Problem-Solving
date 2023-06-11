
public class MergeSort
{
    public static void main(String[] args) {
        int[] arr = {7,3,1,89,44,31,10,8};
        MergeSort merge = new MergeSort();
        for(int num : arr) {
            System.out.println("Element in an Array is:" + num);
        }
        merge.sort(arr,0,arr.length-1);
        merge.printArray(arr);
    }
    public void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print("Element in an Array is:" + arr[i]);
        }
    }
    public void sort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int mid = start+end/2;
            int k=0;
            int n = mid-start+1;
            int m = end-mid;
            int[] leftArr = new int[n];
            int[] rightArr = new int[m];
            for(int i=0;i<=mid;i++){
                leftArr[i] = arr[i];
            }
            for(int j=mid+1;j<=end;j++){
                rightArr[k] = arr[j];
                k++;
            }
            sort(arr, start, mid);
            sort(arr,mid+1, end);
            merge(arr,leftArr, rightArr);
        }
    }
    public void merge(int[] arr, int[] leftArr, int[] rightArr)
    {
        int n1 = leftArr.length;
        int n2 = rightArr.length;
        int i = 0, j = 0;
        int k=0;
        while(i<n1 && j<n2){
            if(leftArr[i]<rightArr[i]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }else{
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
