/**
 * This is alo called as Breadth first search of tree
 * We are traversion in breadth wise.
 * We are covering level by level.
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root);
    }

    public static void levelOrder (Node root) {
        Queue queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node tmp = (Node) queue.poll();
            System.out.print(tmp.data + " ");
            if(tmp.left != null) {
                queue.offer(tmp.left);
            }
            if(tmp.right != null) {
                queue.offer(tmp.right);
            }
        }
    }
}
