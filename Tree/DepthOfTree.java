import java.util.LinkedList;
import java.util.Queue;

public class DepthOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        calculateDepth(root);
        System.out.println("Depth of tree is "+ calculateDepth(root));
    }
    public static int calculateDepth (Node root)
    {
        Queue queue = new LinkedList();
        queue.offer(root);
        queue.offer(null);
        int count =0;
        while (!queue.isEmpty()) {
            Node tmp = (Node) queue.poll();
            if(tmp != null) {
                if(tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if(tmp.right != null) {
                    queue.offer(tmp.right);
                }
            } else {
                count++;
                if(!queue.isEmpty()) {
                    queue.offer(null);
                }
            }
        }
        return count;
    }
}
