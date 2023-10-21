/**
 * Same approach as top view like Level order traversal
 *
 * Only difference is with Top Order Traversal we were just adding first occurences of each values
 *
 * For Bottom View We will add all occurences in the map and last updated would be the last value which we need for bottom view.
 */

import java.util.*;

public class BottomViewTree
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
        BottomViewTree bottomViewTree = new BottomViewTree();
        System.out.println(bottomViewTree.checkBottomView (root));
    }

    public List<Integer> checkBottomView (Node root) {
        Queue<QueueObj> queue = new LinkedList<>();
        queue.add(new QueueObj(root , 0));
        HashMap<Integer, Node> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            QueueObj n = queue.poll();
            map.put(n.val, n.node);

            if(n.node.left != null) {
                queue.add(new QueueObj(n.node.left, n.val-1));
            }
            if(n.node.right != null) {
                queue.add(new QueueObj(n.node.right, n.val+1));
            }
        }
        for(Map.Entry<Integer, Node> e : map.entrySet()) {
            list.add(e.getValue().data);
        }
        return list;
    }
}
