/**
 * https://www.youtube.com/watch?v=_-QHfMDde90
 *
 * To find lowest common ancestor Use depth first search and when u find that particular value
 * send that value to the top to the node and if any node has val1 an val2 getting carry forward
 * to the root node, then that means that node is the LCA node.
 */

public class LCATree
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
        LCATree lcaTree = new LCATree();
        Node res = lcaTree.findLca(root, 8, 4);
        System.out.println(res.data);
    }

    public Node findLca (Node root, int val1, int val2) {
        if(root == null || root.data == val1 || root.data == val2) {
            return root;
        }
        Node left = findLca(root.left, val1, val2);
        Node right = findLca(root.right, val1, val2);
        if(left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
}
