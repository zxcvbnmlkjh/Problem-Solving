public class CheckElementInTree
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
        CheckElementInTree checkElementInTree = new CheckElementInTree();
        System.out.println("Exists:" + checkElementInTree.checkIfExists(root, 8));
    }

    public boolean checkIfExists (Node root, int k) {

        if(root == null) {
            return false;
        }
        if(root.data == k) {
            return true;
        }
        boolean leftCheck = checkIfExists(root.left , k);
        boolean rightCheck = checkIfExists(root.right, k);
        if(leftCheck || rightCheck) {
            return true;
        } else {
            return false;
        }
        //return leftCheck || rightCheck;
    }
}
