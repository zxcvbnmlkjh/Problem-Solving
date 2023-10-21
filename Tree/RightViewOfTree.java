/**
 * Same as left View Approach just changed the order first putting right value then entering the left value.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTree
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
        RightViewOfTree rightViewOfTree = new RightViewOfTree();
        System.out.println(rightViewOfTree.rightView(root));
    }

    public List<Integer> rightView (Node root) {

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
                if (n.right != null) {
                    queue.add(n.right);
                }
                if (n.left != null) {
                    queue.add(n.left);
                }
            }
        }
        return resultList;
    }
}
