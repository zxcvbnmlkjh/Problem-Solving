import java.util.ArrayList;
import java.util.Stack;

public class InOrder_Iterative
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(inOrder(root));
    }
    public static ArrayList inOrder (Node root)
    {
        ArrayList list = new ArrayList();
        Boolean done = true;
        Stack stack = new Stack();
        Node curr = root;
        if(root == null) {
            return list;
        } else {
            while (done) {
                if(curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    if(stack.isEmpty()) {
                        done = false;
                    } else {
                        Node temp = (Node) stack.pop();
                        list.add(temp.data);
                        curr = temp.right;
                    }

                }
            }
        }
        return list;
    }
}
