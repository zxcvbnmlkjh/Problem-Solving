/**
 *
 * https://leetcode.com/problems/find-center-of-star-graph/description/
 *
 * Iterating over matrix and increasing count for both element as its undirectional graph
 * if count is equal to totalElement -1 that means that node is connected to all other node except itself.
 *
 */

import java.util.HashMap;
import java.util.Map;

public class FindStarInGraph
{
    public static void main(String[] args) {
        FindStarInGraph starInGraph = new FindStarInGraph();
        int[][] edges = {{1,4},{4,3},{2,4}};
        int result = starInGraph.findStarElement(edges);
        System.out.println("result is:"+ result);

    }
    public int findStarElement (int[][] edges) {

        int maxLen=0;
            // Find total number of nodes from input
            for(int i=0;i<edges.length;i++){
                maxLen = Math.max(maxLen, Math.max(edges[i][0], edges[i][1]));
            }
            Map<Integer, Integer> map = new HashMap<>();
            int initCount = 0;
            // Creating a map with intial count of 0
            for(int i=1; i<=maxLen;i++) {
                map.put(i, initCount);
            }

            for(int i=0;i< edges.length; i++) {
                int elem1 = edges[i][0];
                int elem2 = edges[i][1];
                map.put(elem1, map.get(elem1) + 1);
                map.put(elem2, map.get(elem2) + 1);
                if (map.get(elem1) == maxLen - 1) {
                    return elem1;
                }
                if (map.get(elem2) == maxLen - 1) {
                    return elem2;
                }
            }
        return -1;
    }
}
