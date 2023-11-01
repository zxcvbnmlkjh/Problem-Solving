/**
 *  https://leetcode.com/problems/maximum-product-subarray/description/
 *
 *  https://www.youtube.com/watch?v=GbJh0MjUa5U
 *
 *  keep 2 variables product and maxproduct
 *
 *  Same as kadane's algorithm two difference
 *
 *  1 when product becomes 0 change product to 1
 *  Same process we need to do it from the end and select the maxproduct from both the sides.
 */
package TwoPointer;

import java.util.Collections;

public class MaximumProductSubArray
{
    public static void main (String[] args)
    {
        int[] arr = {0,2,3,-2};
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        System.out.println("Max Product is:" + maximumProductSubArray.findMax(arr));
    }

    public int findMax(int [] arr) {
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for(int i =0; i< arr.length; i++) {
            product = product * arr[i];
            maxProduct = Math.max(maxProduct, Math.max(product, arr[i]));
            if(product == 0) {
                product = 1;
            }
        }
        product = 1;
        for(int i =arr.length-1; i>=0 ; i--) {
            product = product * arr[i];
            maxProduct = Math.max(maxProduct, Math.max(product, arr[i]));
            if(product == 0) {
                product = 1;
            }
        }
        return maxProduct;
    }
}
