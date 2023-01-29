import java.util.*;

/**
 * This will check if path exists between source and destination
 */
public class FindIfPathExistsInGraph
{
    public static void main(String[] args) {
        FindIfPathExistsInGraph findIfPath = new FindIfPathExistsInGraph();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        findIfPath.addEdge(map, 0, 1);
        findIfPath.addEdge(map, 0, 2);
        findIfPath.addEdge(map, 3, 5);
        findIfPath.addEdge(map, 5, 4);
        findIfPath.addEdge(map, 4 ,3);
        boolean[] visited = new boolean[map.size()];
        System.out.print("Path Exists: " + findIfPath.findIfPathExists(map, 0, 5, visited));
    }

    void addEdge (Map<Integer, List<Integer>> map, int i , int j) {
        map.get(i).add(j);
        map.get(j).add(i);
    }
    public boolean findIfPathExists(Map<Integer, List<Integer>> map , int source, int dest, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()) {
            int elem = queue.poll();
            List<Integer> integerList = map.get(elem);
            for(int i : integerList) {
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        if(visited[dest]) {
            return true;
        }
        return false;
    }


}
