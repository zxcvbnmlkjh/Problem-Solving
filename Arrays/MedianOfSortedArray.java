/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * Median of Two Sorted Arrays
 *
 */
public class MedianOfSortedArray
{
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        MedianOfSortedArray median = new MedianOfSortedArray();
        System.out.print(median.findMedianSortedArrays(nums1, nums2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int len = n+m;
        double mid;
        int[] arr = new int[len];
        int i=0;
        int j =0;
        int p=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] < nums2[j]) {
                arr[p] = nums1[i];
                i++;
                p++;
            } else {
                arr[p] = nums2[j];
                j++;
                p++;
            }
        }
        if(i<nums1.length) {
            while(i<nums1.length){
                arr[p] = nums1[i];
                i++;
                p++;
            }
        }
        if(j<nums2.length) {
            while(j<nums2.length) {
                arr[p] = nums2[j];
                p++;
                j++;
            }
        }

        if(len%2 == 0) {
            mid = (float)(arr[len/2-1] + arr[len/2])/2;
        } else {
            mid = arr[len/2];
        }
        return mid;
    }
}
