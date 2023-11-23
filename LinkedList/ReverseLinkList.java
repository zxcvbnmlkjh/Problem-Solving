public class ReverseLinkList
{
    public static void main (String[] args)
    {
        ListNodee node1 = new ListNodee(1, null);
        ListNodee node2 = new ListNodee(2, null);
        ListNodee node3 = new ListNodee(3, null);
        ListNodee node4 = new ListNodee(4, null);
        ListNodee node5 = new ListNodee(5, null);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);
        ReverseLinkList reverseLinkList = new ReverseLinkList();
        ListNodee resNode = reverseLinkList.reverseList(node1);
        reverseLinkList.printList(resNode);
    }

    public void printList (ListNodee head) {

        ListNodee test = head;

        while(test!= null) {
            System.out.println(test.data);
            test = test.next;
        }
    }

    public ListNodee reverseList (ListNodee head) {
        ListNodee curr = head;
        ListNodee next = null;
        ListNodee prev = null;
        while(curr != null) {
            next = curr.next; // 2
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class ListNodee
{
    int data;
    ListNodee next;

    ListNodee(int data, ListNodee next) {
        this.data = data;
        this.next = next;
    }

    public int getData ()
    {
        return data;
    }

    public void setData (int data)
    {
        this.data = data;
    }

    public ListNodee getNext ()
    {
        return next;
    }

    public void setNext (ListNodee next)
    {
        this.next = next;
    }

    @Override public String toString ()
    {
        return "ListNodee{" +
            "data=" + data +
            ", next=" + next +
            '}';
    }
}
