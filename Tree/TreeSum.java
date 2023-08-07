/**
 * Get the sum of nodes in the left subtree and right subtree. Check if the sum calculated
 * is equal to the root’s data. Also, recursively check if the left and right subtrees are SumTrees.
 *
 * Divide this in 3 steps
 *
 * Calculte Sum of left subtree
 * Calculate Sum of right subtree
 * leftSum+righsum = root.data and subtree is also Tree Sum
 * Three conditions we are checking
 * leftSum+righsum = root.data && isTreeSum(root.left) && isTreeSum(root.right)
 *
 * // Similar to Diameter of tree where we had 3 conditions
 *  Height of Left Tree, Height of Right Tree, Diameter of Left Tree, diameter of right tree
 *
 * Complexity of all these questions are O(N^2)
 */
public class TreeSum
{
    public static void main (String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        if(isTreeSum(root) == 1) {
            System.out.println("Trueee");
        } else {
            System.out.println("Falsee");
        }
    }

    public static int isTreeSum (Node root) {

        if(root == null || (root.left == null && root.right == null)) {
            return 1;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if(leftSum+rightSum == root.data && isTreeSum(root.left) == 1 && isTreeSum(root.right) == 1) {
            return 1;
        }
        return -1;
    }

    public static int sum (Node node) {
        if(node == null)
        {
            return 0;
        }
        return (sum(node.left) + node.data+sum(node.right));
    }

}
