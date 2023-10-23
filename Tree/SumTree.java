public class SumTree
{
    public static void main (String[] args)
    {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        SumTree sumTree = new SumTree();
        System.out.println(sumTree.checkSumTree(root));

    }
    public boolean checkSumTree (Node root) {
        int lSum = sum(root.left);
        int rSum = sum(root.right);
        boolean checkLeft =  checkSumTree(root.left);
        boolean checkRight = checkSumTree(root.right);
        return checkLeft && checkRight && (lSum+rSum == root.data);
    }

    public int sum (Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.data;
        }
        return sum(root.left) + sum(root.right);
    }
}
