public class SearchElement_Recursive {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(searchElement(root, 7));
    }

    public static boolean searchElement(Node root, int elem) {
        if (root == null) {
            return false;
        }
        if (root.data == elem) {
            return true;
        }
       /* boolean res = searchElement(root.left, elem);
        if(res == true) {
            return true;
        }

        boolean res1 = searchElement(root.right, elem);

        if(res1 == true) {
            return true;
        }*/
        return searchElement(root.left, elem) || searchElement(root.right, elem);
        //return false;
    }
}