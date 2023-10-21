/**
 * Similar to Level order traversal based on levels and printing first element at each level.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOfTree
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.right = new Node(7);
        LeftViewOfTree leftViewOfTree = new LeftViewOfTree();
        System.out.println(leftViewOfTree.leftView(root));
    }
    public List<Integer> leftView (Node root) {

        Queue<Node> queue = new LinkedList<>();
        List<Integer> resultList = new ArrayList<>();
        resultList.add(root.data);
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            if(n == null && !queue.isEmpty()) {
                resultList.add(queue.peek().data);
                queue.add(null);
            } else if(n == null && queue.isEmpty()) {
                break;
            }else {
                if (n.left != null) {
                    queue.add(n.left);
                }
                if (n.right != null) {
                    queue.add(n.right);
                }
            }
        }
        return resultList;
    }
}
