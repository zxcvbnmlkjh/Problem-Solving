public class CheckPerfectTree
{
    public static void main (String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(1);
        CheckPerfectTree checkPerfectTree = new CheckPerfectTree();
        System.out.println(checkPerfectTree.checkPerfectTree(root));
    }
        public boolean checkPerfectTree(Node root) {
            if(root == null){
                return true;
            }
            if(root.left != null && root.left.data > root.data){
                return false;
            }
            if(root.right != null && root.right.data > root.data){
                return false;
            }
            boolean isLeftValid = checkPerfectTree(root.left);
            boolean isRightValid = checkPerfectTree(root.right);
            return isLeftValid && isRightValid;
    }
}
