/**
 *
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 *
 */

public class MergeTrees
{
    public static void main (String[] args)
    {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(4);
        root2.left = new Node(5);

        MergeTrees merge = new MergeTrees();
        merge.mergerNode(root1, root2);

        // For Printing
        inOrder(root1);

    }

    public Node mergerNode (Node root1, Node root2) {

        if(root1 == null && root2 == null) {
            return null;
        }
        if(root1 ==null) {
            return root2;
        }
        if(root2 == null) {
            return root1;
        }
        root1.data = root1.data + root2.data;
        root1.left = mergerNode(root1.left, root2.left);
        root1.right = mergerNode(root1.right, root2.right);
        return root1;
    }

    public static void inOrder (Node root)
    {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
