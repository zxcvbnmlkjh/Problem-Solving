/**
 * Extension of Problem Find element in binary tree
 *
 * If we find out the element we send the response as true and we send true till the root node and store the values in list
 * Return the list at the end which will return entire path.
 *
 * https://github.com/zxcvbnmlkjh/Problem-Solving/blob/main/Tree/CheckElementInTree.java
 */

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath
{
    static List<Integer> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(8);
        root.right.right.left = new Node(6);
        RootToLeafPath checkElementInTree = new RootToLeafPath();
        System.out.println("Exists:" + checkElementInTree.checkIfExists(root, 8 ));
        System.out.println(resultList);
    }

    public boolean checkIfExists (Node root, int k) {

        if(root == null) {
            return false;
        }
        if(root.data == k) {
            resultList.add(root.data);
            return true;
        }
        boolean leftCheck = checkIfExists(root.left , k);
        boolean rightCheck = checkIfExists(root.right, k);
        if(leftCheck || rightCheck) {
            resultList.add(root.data);
            return true;
        } else {
            return false;
        }
    }
}
