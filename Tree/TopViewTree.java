/**
 * To find the top view of tree we marked top node as 0 and left node we do -1 and for right node we do +1
 * Then we take a hashmap and withing that hashmap we add those values as key and add first node value as value
 *
 */

import java.util.*;

public class TopViewTree
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
        TopViewTree topViewTree = new TopViewTree();
        System.out.println(topViewTree.checkTopView (root));
    }

    public List<Integer> checkTopView (Node root) {
        Queue<QueueObj> queue = new LinkedList<>();
        queue.add(new QueueObj(root , 0));
        HashMap<Integer, Node> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            QueueObj n = queue.poll();
            if(!map.containsKey(n.val)) {
                map.put(n.val, n.node);
            }
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

class QueueObj {
    Node node;
    int val;
    QueueObj(Node node , int val) {
        this.node = node;
        this.val = val ;
    }
}
