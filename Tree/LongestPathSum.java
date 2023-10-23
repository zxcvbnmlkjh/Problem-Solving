public class LongestPathSum
{
    int maxLen = 0;
    int maxSum = 0;
    public static void main (String[] args)
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.left.left = new Node(7);
        root.left.right = new Node(1);
        root.right.left = new Node(2);
        root.right.right = new Node(3);
        root.left.right.left = new Node(7);

        LongestPathSum longestPathSum = new LongestPathSum();
        System.out.print(longestPathSum.checkSum(root));
    }

    public int checkSum (Node root) {
        check(root, 0, 0);
        return maxSum;
    }

    public void check (Node root, int sum, int len) {

        if(root == null) {
            if(len > maxLen) {
                maxLen = len;
                maxSum = sum;
            } else if(len == maxLen && maxSum < sum) {
                maxSum = sum;
            }
            return;
        }
        check(root.left, sum+ root.data, len+1);
        check(root.right, sum+root.data, len+1);
    }

}
