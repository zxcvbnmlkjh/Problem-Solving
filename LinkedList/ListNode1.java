public class ListNode1
{
      int val;
      ListNode1 next;
      ListNode1 () {}
      ListNode1 (int val) { this.val = val; }

    public int getVal ()
    {
        return val;
    }

    public void setVal (int val)
    {
        this.val = val;
    }

    public ListNode1 getNext ()
    {
        return next;
    }

    public void setNext (ListNode1 next)
    {
        this.next = next;
    }

    ListNode1 (int val, ListNode1 next) { this.val = val; this.next = next; }
 }
