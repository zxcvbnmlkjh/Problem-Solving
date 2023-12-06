
public class MergeSort
{
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 10};
        MergeSort merge = new MergeSort();
        for(int num : arr) {
            System.out.print( num + " ");
        }
        merge.sort(arr,arr.length-1);
        merge.printArray(arr);
    }
    public void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print("Element in an Array is:" + arr[i]);
        }
    }
    public void sort(int[] arr, int len)
    {
            int mid = len /2;
            int p = 0;
            int k=0;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[len-mid];
        for(int i = 0;i<len;++i){
            if(i<mid){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[k] = arr[i];
                k = k+1;
            }
        }
            sort(leftArr,  mid);
            sort(rightArr,len-mid);
            merge(arr,leftArr, rightArr);

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
