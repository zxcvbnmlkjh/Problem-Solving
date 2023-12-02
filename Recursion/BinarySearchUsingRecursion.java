public class BinarySearchUsingRecursion
{
    public static void main (String[] args)
    {
        int[] arr = {2,4,6,10,14,18};
        BinarySearchUsingRecursion binarySearchUsingRecursion = new BinarySearchUsingRecursion();
        System.out.println("Check Existence: "+ binarySearchUsingRecursion.checkExists(arr, 16));

    }

    public boolean checkExists (int[] arr, int elem) {
        return findNum(arr, elem, 0, arr.length);
    }

    public boolean findNum (int[] arr, int elem, int left, int right) {

        int mid = (left+right)/2;
        if(arr[mid] == elem) {
            return true;
        }
        if(left > right) {
            return false;
        }
        if(arr[mid] > elem) {
            right = mid-1;
        }
        if(arr[mid] < elem) {
            left = mid+1;
        }
        return findNum(arr, elem, left, right);
    }

}
