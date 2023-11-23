/**
 * BFS Travel is kind of level order traversal in tree. We traverse all the nodes level by level using queue.
 * Addn DS used are Queue,Visited Array, List<List<Integer>> for adj list representation
 *
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_Traversal
{
    public static void main(String[] args) {

        BFS_Traversal traversal = new BFS_Traversal();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        traversal.addEdge(list, 0, 1);
        traversal.addEdge(list, 1, 2);
        traversal.addEdge(list, 2, 3);
        traversal.addEdge(list, 3, 4);
        traversal.addEdge(list, 0, 4);
        traversal.addEdge(list, 4, 1);
        traversal.addEdge(list, 1, 3);
        traversal.traverse(list, 2);
    }
    void addEdge (List<List<Integer>> list, int i , int j) {
        list.get(i).add(j);
        list.get(j).add(i);
    }
    public void traverse(List<List<Integer>> list, int i)
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];
        queue.add(i);
        visited[i] = true;
        while(!queue.isEmpty()) {
            int elem = queue.poll();
            System.out.print(elem + " ");
            List<Integer> elemList = list.get(elem);
            for(int element : elemList) {
                if(!visited[element]){
                    queue.add(element);
                    visited[element] = true;
                }
            }
        }

    }
}
