import java.util.*;
public class Test
{

    public static void main(String[] args) {
        int[][] edges = {{0,4}};
        Test test = new Test();
        System.out.print("Path exists "+ test.validPath(5, edges, 0 , 4));
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges[0].length>1)
        {
            Map<Integer, List<Integer>> map = new HashMap<>();
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
            }
            System.out.println(edges.length);
            for(int i=0;i<edges.length;i++) {
                addEdge(map, edges[i][0], edges[i][1]);
                addEdge(map, edges[i][1], edges[i][0]);
            }
            return findIfPathExists(map, source, destination, visited);
        } else {
            return false;
        }

    }

    void addEdge (Map<Integer, List<Integer>> map, int i , int j) {
        map.get(i).add(j);
        map.get(j).add(i);
    }

    public boolean findIfPathExists(Map<Integer, List<Integer>> map , int source, int dest,
                                    boolean[] visited) {

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
