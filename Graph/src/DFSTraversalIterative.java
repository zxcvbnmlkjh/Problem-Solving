/**
 * DFS traversal iteratively uses stack. In stack we push initial elem and
 * then fetch adj list against that elem and iterate over that list and
 * whatever elem is not visited put that in stack and pop until stack is empty.
 *
 * Addn DS stack , visited Array
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSTraversalIterative
{
    public static void main(String[] args) {
        DFSTraversalIterative traversal = new DFSTraversalIterative();
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
        Stack<Integer> stack = new Stack();
        stack.push(i);
        visited[i] = true;




            int elem = stack.pop();
            System.out.println(elem + " ");
            List<Integer> elemList = list.get(elem);
            for(int item : elemList) {
                if(!visited[item]){
                    stack.push(item);
                    visited[item] = true;
                }
            }
        }

    }

