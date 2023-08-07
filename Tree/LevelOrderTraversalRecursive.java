public class LevelOrderTraversalRecursive
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
        printLevelOrder(root);
    }

    static int findHeight (Node root) {
        if(root == null) {
            return 0;
        }
        int res = Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        return res;
    }

    static void printLevelOrder(Node root)
    {
        int h = findHeight(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    static void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }


}
