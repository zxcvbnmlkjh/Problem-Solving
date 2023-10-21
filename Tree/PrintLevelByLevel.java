import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelByLevel
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
        PrintLevelByLevel print = new PrintLevelByLevel();
        print.levelOrderPrint(root);
    }
    public void levelOrderPrint (Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count =1;
        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp == null && !queue.isEmpty()) {
                count ++;
                queue.add(null);
                System.out.println("\n");
            }
            else if(temp != null && !queue.isEmpty()) {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        System.out.println("Levels" + count);
    }
}
