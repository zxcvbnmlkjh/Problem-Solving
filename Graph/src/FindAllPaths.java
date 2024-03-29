/**
 * https://www.geeksforgeeks.org/find-paths-given-source-destination/
 *
 * Used DFS to find all paths from source to destination
 */

import java.util.*;

public class FindAllPaths
{
    public static void main(String[] args) {
        FindAllPaths findAllPaths = new FindAllPaths();
        List<Integer> resultList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0,new ArrayList<>(Arrays.asList(1, 2)));
        map.put(1,new ArrayList<>(Arrays.asList(3)));
        map.put(2,new ArrayList<>(Arrays.asList(3)));
        map.put(3,new ArrayList<>(Arrays.asList()));
        resultList.add(0);
        findAllPaths.dfs(map, 0, 3, resultList, finalList);
    }
    public void dfs(Map<Integer, List<Integer>> map, int start, int end, List<Integer> resultList, List<List<Integer>> finalList) {
            if(start == end){
                finalList.add(resultList);
                System.out.print("final list:"+ finalList + " ");
                //System.out.print("Resultlist"+ resultList + " ");
                return;
            }
            List<Integer> list = map.get(start);
            for(Integer i : list) {
                resultList.add(i);   // 1
                dfs(map, i, end, resultList, finalList);
                resultList.remove(i);
            }
    }
}
