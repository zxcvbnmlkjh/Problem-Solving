/**
 * When we need to do sum from the beginning we need not to take any additional datastructure here.
 *
 * Just take two list ptrs if one is longer than other add those many zero to the shorter list at the end.
 *
 * start adding both the list values and if greater than 10 take mod and change carry
 *
 * We have taken 1 dummy node and 1 curr node, initially dummy = curr
 *
 * When we changed current firsttime dummy and curr are pointing to same.
 * Then we changed curr again n again to point to new created nodes.
 * In that case dummy.next will point to the newly added list.
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class SumofLists
{
    public static void main (String[] args)
    {
        ListNode1 node1 = new ListNode1(5);
        ListNode1 node2 = new ListNode1(6);
        ListNode1 node3 = new ListNode1(3);
        ListNode1 node7 = new ListNode1(1);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node7);
        node7.setNext(null);
        ListNode1 node4 = new ListNode1(8);
        ListNode1 node5 = new ListNode1(4);
        ListNode1 node6 = new ListNode1(2);

        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(null);

        SumofLists sum = new SumofLists();
        ListNode1 res = sum.addTwoNumbers(node1, node4);

        sum.printList(res);
    }

    public void printList(ListNode1 temp) {
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1) {

            int digit1 = l1 != null? l1.val : 0;
            int digit2 = l2 != null? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode1 newList = new ListNode1(digit);
            curr.next = newList;
            curr = curr.next;

            l1 = (l1!= null)? l1.next : null;
            l2 = (l2!=null)? l2.next : null;

        }
        return dummy.next;
    }
}
