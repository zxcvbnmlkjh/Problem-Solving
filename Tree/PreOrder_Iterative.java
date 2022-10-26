import java.util.Stack;

public class PreOrder_Iterative {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);
    }

    public static void preOrder(Node root) {

        Stack stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node temp = (Node) stack.pop();
            System.out.print(temp.getData() + " ");

            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }

        }
    }
}
