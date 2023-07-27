public class HeightOfTree
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(9);
        HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println("Height of tree:"+ heightOfTree.findHeight(root));
    }
    int findHeight (Node root) {
       if(root == null) {
           return 0;
       }
        int res = Math.max(findHeight(root.left), findHeight(root.right)) + 1;
       return res;
    }
}
