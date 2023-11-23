import java.util.HashSet;
import java.util.Set;

public class IntersectionList
{
    public static void main (String[] args)
    {

        //1 3 5 9 7 12 17 null --> 7

        //7 8 2 9 4 12 17 null --> 7
        ListNodee node1 = new ListNodee(1, null);
        ListNodee node2 = new ListNodee(3, null);
        ListNodee node3 = new ListNodee(5, null);
        ListNodee node4 = new ListNodee(9, null);
        ListNodee node5 = new ListNodee(7, null);
        ListNodee node6 = new ListNodee(12, null);
        ListNodee node7 = new ListNodee(17, null);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(null);

        ListNodee node8 = new ListNodee(7, null);
        ListNodee node9 = new ListNodee(8, null);
        ListNodee node10 = new ListNodee(2, null);
        ListNodee node11 = new ListNodee(9, null);
        ListNodee node12 = new ListNodee(4, null);

        node8.setNext(node9);
        node9.setNext(node10);
        node10.setNext(node11);
        node11.setNext(node12);
        node11.setNext(node6);

        IntersectionList intersectionList = new IntersectionList();
        ListNodee node = intersectionList.getIntersectionPoint(node1, node8);
        System.out.println("Interection node is " + node.data);
    }

    public ListNodee getIntersectionPoint (ListNodee node1, ListNodee node2) {

        ListNodee temp = node1;
        ListNodee temp1 = node2;
        Set<ListNodee> set = new HashSet<>();
        while(temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        while(temp1 != null) {
            if (set.contains(temp1)) {
                return temp1;
            }
            temp1 = temp1.next;
        }
        return null;
        }
}
