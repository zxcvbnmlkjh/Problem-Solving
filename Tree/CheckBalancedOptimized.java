public class CheckBalancedOptimized
{
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.right.right = new Node(7);
        root.left.right.right.right = new Node(9);
        root.left.right.right.right.right = new Node(10);
        root.left.right.right.right.right.right = new Node(11);
        root.left.right.right = new Node(7);
        root.left.left = new Node(4);
        root.left.left.left = new Node(7);
        root.right.right = new Node(31);
        Height height = new Height();
        System.out.println(checkBal(root, height));

    }



    static boolean checkBal (Node root, Height h) {

        Height lh = new Height();
        Height rh = new Height();
        if(root == null) {
            return true;
        }
        boolean leftBal = checkBal(root.left, lh);
        boolean rightBal = checkBal(root.right, rh);
        h.h = Math.max(lh.h, rh.h) + 1;
        boolean res = (leftBal && rightBal && Math.abs(lh.h - rh.h)<=1);
        if(res == false) {
            return false;
        }
        return true;
    }
}

class Height {
    int h;
}
