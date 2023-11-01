import java.util.ArrayList;
import java.util.List;

public class TargetSumPath
{
    static List<List<Integer>> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(8);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int[] path = new int[20];
        int pathLen = 0;
        TargetSumPath targetSumPath = new TargetSumPath();
        targetSumPath.findPath(root , path, pathLen, root.data,11);
       System.out.println(resultList);
    }
    public void findPath(Node root, int[] path, int pathLen, int sum, int targetSum) {

        if(root == null) {
            return;
        }
        path[pathLen] = root.data;
        pathLen ++;

        if(sum == targetSum && root.left== null && root.right == null) {
            printArray(path, pathLen);
        }
        if(root.left == null && root.right == null) {
            return;
        }
        findPath(root.left, path, pathLen, sum + root.left.data, targetSum);
        findPath(root.right, path, pathLen, sum + root.right.data, targetSum);
    }

    public void printArray (int[] path, int pathLen) {
        List list = new ArrayList();
        for(int j=0; j<pathLen;j++) {
            list.add(path[j]);
        }
        resultList.add(list);
    }
}
