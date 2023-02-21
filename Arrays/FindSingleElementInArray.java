/**
 * Find Single element in Sorted Array
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * Naive approach - Start a for loop with increment of i=i+2
 * If arr[i] != arr[i+1] then that means arr[i] is the element.
 *
 * Second Approach would be using XOR functionality
 * XOR of 2 same number is 0. Another Simple Solution is to use the properties of XOR (a ^ a = 0 & a ^ 0 = a).
 * The idea is to find the XOR of the complete array. The XOR of the array is the required answer.
 * Answer after XOR would be the single element
 *
 *  Both first and second approach are O(N) TC and O(1) Space complexity
 *
 *  We have another approach which can solve this problem in O(logN) complexity.
 */
public class FindSingleElementInArray
{
    public static void main (String[] args)
    {
        int[] arr = {3,3,7,7,10,11,11};
        FindSingleElementInArray findSingleElementInArray = new FindSingleElementInArray();
        //System.out.println("Element is "+findSingleElementInArray.findSingleElementUsingForLoop(arr));
        System.out.println("Element is "+findSingleElementInArray.findSingleElementUsingXOR(arr));
    }

    // First Approach
    public int findSingleElementUsingForLoop(int[] arr) {
        for(int i=0; i<arr.length;i=i+2) {
            if(arr[i] != arr[i+1]) {
                return arr[i];
            }
        }
        return 0;
    }

    // Second Approach
    public int findSingleElementUsingXOR (int[] arr) {

        int num = 0;
        for(int i=0;i<arr.length;i++) {
            num = num ^ arr[i];
        }
        return num;
    }
}
