import java.util.LinkedList;
import java.util.Queue;

public class SearchElement_Iterative
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(searchElement(root, 7));
    }
    public static boolean searchElement (Node root, int elem) {
        Queue queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node tmp = (Node) queue.poll();
            if(tmp.data == elem) {
                return true;
            }
            if(tmp.left != null) {
                queue.offer(tmp.left);
            }
            if(tmp.right != null) {
                queue.offer(tmp.right);
            }
        }
        return false;
    }
}
