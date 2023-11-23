import java.util.*;

/**
 * There are 2 ways to check this BFS or DFS
 * Create a new map for Parent
 * 2 things u need to check if cycle exists or not
 *
 * 1. If visited is false for the element just simply add to the visited array and add poped node as parent to the sub paths
 *
 * 2. Check parent of node if it visited node is not parent then that means some other node has accessed it and loop exists
 *
 * ** If any node has visited as true and that node is not parent for your poped element, then that means Cycle exists.
 */
public class CycleDetectionInGraph {

    public static void main (String[] args)
    {
        CycleDetectionInGraph cycleDetectionInGraph = new CycleDetectionInGraph();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        cycleDetectionInGraph.addEdge(list, 0, 1);
        cycleDetectionInGraph.addEdge(list, 1, 2);
        cycleDetectionInGraph.addEdge(list, 2, 3);
        cycleDetectionInGraph.addEdge(list, 3, 4);
        //cycleDetectionInGraph.addEdge(list, 0, 4);
        //cycleDetectionInGraph.addEdge(list, 4, 1);
        //cycleDetectionInGraph.addEdge(list, 1, 3);
        boolean[] visited = new boolean[list.size()];
        Arrays.fill(visited, false);
        System.out.println("Cycle exists " + cycleDetectionInGraph.findCycle(list, 0, visited));
    }

    void addEdge (List<List<Integer>> list, int i , int j) {
        list.get(i).add(j);
        list.get(j).add(i);
    }

    boolean findCycle (List<List<Integer>> list, int i, boolean[] visited) {

        Queue<Integer> queue = new LinkedList();
        queue.add(i);
        Map<Integer, Integer> parentMap = new HashMap<>();
        parentMap.put(i , -1);
        visited[i] = true;

        while(!queue.isEmpty()) {

            int elem = queue.poll();
            List<Integer> nodeList = list.get(elem);

            for(int val : nodeList) {

                if(!visited[val]) {
                    visited[val] = true;
                    parentMap.put(val, elem);
                    queue.add(val);
                } else if (parentMap.get(elem) != val) {
                    return true;
                }

            }

        }
        return false;
    }
}
