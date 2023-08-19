/**
 * https://www.scaler.com/topics/iterative-inorder-traversal/
 *
 * ** There are 2 main key things here one is currNode and other one is stack size not empty.
 *
 * This is an easier approach using 2 while loops first to check currr is not null and stack not empty
 * Second while loop is to fill all left elements in the stack till the end.
 */

import java.util.Stack;
public class InOrderIterativeEasy
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
        inOrderTraversal(root);
    }

    static void inOrderTraversal(Node root)
    {
        Stack<Node> treeStack = new Stack<>();
        Node currentNode = root;

        while (currentNode != null || treeStack.empty() == false)
        {
            //condition to check if the node is leftmost node
            while (currentNode != null)
            {
                // step 3 of our algorithm
                treeStack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = treeStack.peek();
            treeStack.pop();
            // cout statement to print the node data
            System.out.println("Value of current data is:"+ currentNode.data);

            // statement to process right subtree
            currentNode = currentNode.right;
        }
    }
}
