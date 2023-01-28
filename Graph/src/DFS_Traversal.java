import java.util.ArrayList;
import java.util.List;

public class DFS_Traversal {
    public static void main(String[] args) {

        DFS_Traversal traversal = new DFS_Traversal();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        traversal.addEdge(list, 0, 1);
        traversal.addEdge(list, 1, 2);
        traversal.addEdge(list, 3, 4);
        traversal.addEdge(list, 2, 3);
        traversal.addEdge(list, 4, 1);
        traversal.traverse(list, 2);
    }

    void addEdge(List<List<Integer>> list, int i, int j) {
        list.get(i).add(j);
        list.get(j).add(i);
    }

    public void traverse(List<List<Integer>> list, int i) {

        boolean[] visited = new boolean[list.size()];
       dfs(list, visited, i);

    }

    public void dfs(List<List<Integer>> list, boolean[] visited , int i) {
        visited[i] = true;
        System.out.print(i + " ");
        List<Integer> elemList = list.get(i);
        for(int element : elemList) {
            if(!visited[element]) {
                visited[element] = true;
                dfs(list, visited, element);
            }
        }
    }
}