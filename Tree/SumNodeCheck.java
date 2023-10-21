public class SumNodeCheck
{
    public static void main (String[] args)
    {
        Node root = new Node(9);
        root.left = new Node(5);
        root.right = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        SumNodeCheck sum = new SumNodeCheck();
        System.out.println(sum.checkSumNode(root));
    }



    public static int checkSumNode(Node node) {
        if(node == null || node.left == null && node.right == null) {
            return 1;
        }
        int leftCheckSum = checkSumNode(node.left);
        int rightCheckSum = checkSumNode(node.right);
        int leftSum = checkSum(node.left);
        int rightSum = checkSum(node.right);

        if(leftCheckSum==1 && rightCheckSum == 1 && (leftSum+rightSum == node.data)){
            return 1;
        }
        return 0;
    }

    public static int checkSum (Node node) {

        if(node == null) {
            return 0;
        }
        return checkSum(node.left) + checkSum(node.right) + node.data;
    }
}
