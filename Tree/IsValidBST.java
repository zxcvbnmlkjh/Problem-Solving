import java.util.Stack;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/description/?envType=featured-list&envId=top-interview-questions%3FenvType%3Dfeatured-list&envId=top-interview-questions
 *
 * If left subtree has any element greater than root it is invalid BST.
 * If right subtree has any element smaller than root it is invalid.
 *
 * So we created a helper method which has 3 parameter which takes root value and root.left && root value and root.right.
 *
 * Min Value refers to tha root value in case of rightsubtree as in that case root val should be min
 * Max value refers to the root value in case of left subtree as in that case root val should be max.
 */
public class IsValidBST
{
    public static void main (String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.right.left = new Node(3);
        root.right.right = new Node(7);
        IsValidBST validBST = new IsValidBST();
        System.out.println(validBST.isValidBST(root));
    }

    public boolean isValidBST(Node root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(Node root, long minVal, long maxVal)
    {
        if(root == null) {
            return true;
        }
        if(root.data >= maxVal || root.data <= minVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.data) && isValidBST(root.right, root.data, maxVal);

    }
}
