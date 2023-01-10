/**
 * This approach has time complexity as O(n) and space complexity as O(n).
 * In this aproach we use a HashMap, in hashmap we store Key as cumSum and value as the index till that point of sum
 * cumSum = total sum till the i
 * sum = desired sum
 * cumSum - sum
 * if sum exists in the Array, cumSum-sum will also exist in the map as a key. Thats the logic behind this.
 */

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum_Improved
{
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int sum = 3;
        SubArrayWithGivenSum_Improved subArrayWithGivenSumImproved = new SubArrayWithGivenSum_Improved();
        subArrayWithGivenSumImproved.getIndex(arr, sum);

    }
    public void getIndex(int[] arr, int sum) {
       Map<Integer,Integer> map = new HashMap<>();
       int cumSum = 0;
       int start = 0;
       int end = -1;
       int count=0;
       for(int i=0; i< arr.length; i++) {
           cumSum = cumSum + arr[i];
           int remSum = cumSum - sum;
           if(map.containsKey(remSum)) {
                start = map.get(remSum) + 1;
                end = i;
                count++;
               System.out.println("Start index is:" + start + " End index is:" + end);
           } else {
               map.put(cumSum, i);
           }
       }
        if(end == -1) {
            System.out.println("Doesnt exist");
        }
        System.out.println("Total number of subArrays with given sum:"+ count);
    }
}
