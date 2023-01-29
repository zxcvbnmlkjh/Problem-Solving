/**
 * https://www.youtube.com/watch?v=UDbdB5zfJ6E
 * To check this we need to keep track of outdegree and indegree
 * outdegree is like how many nodes going out from a node
 * indegree is like how many nodes coming to that node
 * So in this in a map we will maintain a count for eg - [1,2]
 * for 1 we will decrement is counter and for 2 we increment the counter
 * so for any number if it just has indegree then the count should be n-1
 *
 */

import java.util.*;

public class FindTownJudge
{
    public static void main(String[] args) {
        FindTownJudge findTownJudge = new FindTownJudge();
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }
        findTownJudge.addEdge(map, 1, 2);
        System.out.println("Judge is " + findTownJudge.find(n, map));
    }
    public int find( int n, Map<Integer, Integer> map) {
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
           if(entrySet.getValue() == n-1) {
               return entrySet.getKey();
           }
        }
        return -1;
    }
    void addEdge (Map<Integer, Integer> map, int i , int j) {
        map.put(i, map.get(i)-1);
        map.put(j, map.get(j)+1);
    }
}
