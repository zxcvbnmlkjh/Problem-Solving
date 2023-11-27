public class IntersectionListWithoutSpace
{
    public static void main (String[] args)
    {
        ListNodee node1 = new ListNodee(1, null);
        ListNodee node2 = new ListNodee(3, null);
        ListNodee node3 = new ListNodee(5, null);
        ListNodee node4 = new ListNodee(9, null);
        ListNodee node5 = new ListNodee(7, null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node3);

        IntersectionListWithoutSpace intersectionListWithoutSpace = new IntersectionListWithoutSpace();
        intersectionListWithoutSpace.findPoint(node1, node5);
    }

    public ListNodee findPoint (ListNodee head1, ListNodee head2) {

        ListNodee temp1 = head1;
        ListNodee temp2 = head2;
        int len1 = 0;
        int len2 = 0;
        while(temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        System.out.println("Length 1:"+ len1);
        System.out.println("Length 2"+ len1);

        return null;
    }
}
