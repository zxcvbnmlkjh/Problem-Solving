import java.util.LinkedList;
import java.util.Queue;

public class MirrorImageOfTreeRecursive
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
        levelOrder(root);
        mirrorImage(root);
        System.out.println("After Mirror image");
        levelOrder(root);
    }
    public static Node mirrorImage (Node root) {
        if(root == null) {
            return root;
        }
        Node left = mirrorImage(root.left);
        Node right = mirrorImage(root.right);
        root.left = right;
        root.right = left;

        return root;
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
