// This is the optimized approach where we are using not calculating height
// again n again we are caluculating with same recursion call
// so the complexity is O(N)

public class DiameterOptimizedComplexity
{
    static int dia = 0;
    public static void main (String[] args)
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(31);

        DiameterOptimizedComplexity diameter = new DiameterOptimizedComplexity();
        diameter.findDiameter(root, dia);
        System.out.println("Diameter of tree is:" + dia);
    }

    int findDiameter (Node root, int dia)
    {
        if(root == null) {
            return 0;
        }
        int leftDia = findDiameter(root.left, dia);
        int rightDia = findDiameter(root.right, dia);

         this.dia = Math.max(dia, leftDia+rightDia+1);
        //int height = findHeight(root.left) + findHeight(root.right) + 1;
        return Math.max(leftDia, rightDia)+ 1;
    }
}
