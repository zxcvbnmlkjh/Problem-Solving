/**
 * To check if tree is balanced or not we need to check three things
 * Left tree is balanced
 * Right tree is balanced
 * HEight of left and right tree should be less than 1 so if all 3 three cond are true
 * This means tree is balanced.
 *
 * TC - O(N^2)
 * SC - O(N)
 *
 */
public class CheckBalanced
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(checkBalanced(root));
    }
    public static boolean checkBalanced (Node root) {

        if(root == null) {
            return  true;
        }

        boolean leftBal = checkBalanced(root.left);
        boolean rightBal = checkBalanced(root.right);

        boolean heightCheck = Math.abs(findHeight(root.left) - findHeight(root.right)) <= 1;

        if(leftBal && rightBal && heightCheck) {
            return true;
        }
        return false;
    }
    static int findHeight (Node root) {
        if(root == null) {
            return 0;
        }
        int res = Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        return res;
    }
}
