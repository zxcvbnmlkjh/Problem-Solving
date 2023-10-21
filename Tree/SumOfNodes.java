public class SumOfNodes
{
    public static void main (String[] args)
    {
        Node root = new Node(9);
        root.left = new Node(5);
        root.right = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        SumOfNodes sum = new SumOfNodes();
        sum.checkSum(root);
        System.out.println(checkSum(root));
    }

    public static int checkSum(Node root) {

        if(root == null) {
            return 0;
        }

        int leftSum = checkSum(root.left);
        int rightSum = checkSum(root.right);
        int res = leftSum+rightSum+root.data;
        return res;
    }
}
