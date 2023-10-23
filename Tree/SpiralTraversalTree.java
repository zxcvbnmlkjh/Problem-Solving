/**
 * Do level order traversal and for each row add the records to the list and based on flag reverse the order and store
 * it to resultList.
 *
 * One difference from level order traversal is we need 1 for loop which parse the entire row together n store it to the list.
 *
 */

import java.util.*;

public class SpiralTraversalTree
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(9);
        root.right.right.left = new Node(8);
        SpiralTraversalTree spiralTraversalTree = new SpiralTraversalTree();
        System.out.println(spiralTraversalTree.spiralTraversal(root));
    }
    public List<List<Integer>> spiralTraversal (Node root) {

        List<List<Integer>> resultList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean LTR = true;
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size;i++) {
                Node n = queue.poll();
                list.add(i,n.data);
                if(n.left != null) {
                    queue.add(n.left);
                }
                if(n.right != null) {
                    queue.add(n.right);
                }
            }
            if(LTR) {
                resultList.add(list);
            } else {
                Collections.reverse(list);
                resultList.add(list);
            }
            LTR = !LTR;
        }
        return resultList;
    }
}
