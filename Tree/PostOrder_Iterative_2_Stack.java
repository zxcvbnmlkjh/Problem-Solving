/**
 * PostOrder Traversal - 2 Stacks
 * Push root
 * First Left
 * Second Right
 */

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder_Iterative_2_Stack {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(postOrder(root));
    }

    public static ArrayList postOrder (Node root) {
        ArrayList result = new ArrayList();
        Stack stack = new Stack();
        Stack<Node> resultStack = new Stack<Node>();
        stack.push(root);
            if(root == null) {
                return result;
            } else {
                while(!stack.isEmpty()){
                    Node temp = (Node) stack.pop();
                    resultStack.push(temp);
                    if(temp.left != null) {
                        stack.push(temp.left);
                    }
                    if(temp.right != null) {
                        stack.push(temp.right);
                    }
                }
            }
            while (!resultStack.isEmpty()) {
                result.add(resultStack.pop().getData());
            }
            return result;
    }
}
