public class KthAncestor
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
    }
}
