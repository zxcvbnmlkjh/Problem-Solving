// Complexity of this approach is O(n^2)

// As in every diameter call we are calculating height again n again which lead it to O(N^2).
public class Diameter
{
    static int ans = 0;
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        Diameter diameter = new Diameter();
        //int res = diameter.findDiameter(root);
        int res = findHeight(root);
        System.out.println("Diameter of tree is:" + res);
    }

    public static int findHeight(Node A){
        if(A == null){
            return -1;
        }

        int lht = findHeight(A.left);
        int rht = findHeight(A.right);

        ans = Math.max(ans,lht+rht+2);
        return (int)(Math.max(lht,rht)+1);
    }
/*    int findDiameter (Node root)
    {
        if(root == null) {
            return 0;
        }
        int leftDia = findDiameter(root.left);
        int rightDia = findDiameter(root.right);
        int height = findHeight(root.left) + findHeight(root.right) + 1;
        return Math.max(height, Math.max(leftDia, rightDia));
    }

    int findHeight (Node root) {
        if(root == null) {
            return 0;
        }
        int res = Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        return res;
    }*/
}
