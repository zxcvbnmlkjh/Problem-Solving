import java.util.*;

// Linked List Node
class Node1 {
    int data;
    Node1 next;
    Node1(int a)
    {
        data = a;
        next = null;
    }
}

public class GFG {
    // utility function to insert Node1 in the list
    static Node1 push(Node1 head, int val)
    {
        Node1 newNode1 = new Node1(val);
        if (head == null) {
            head = newNode1;
            return head;
        }

        Node1 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode1;
        return head;
    }

    // utility function to reverse k Node1s in the list
    static Node1 reverse(Node1 head, int k)
    {
        // If head is NULL or K is 1 then return head
        if (head == null || head.next == null)
            return head;

        // creating dummy Node1
        Node1 dummy = new Node1(-1);
        dummy.next = head;

        // Initializing three points prev, curr, next
        Node1 prev = dummy;
        Node1 curr = dummy;
        Node1 next = dummy;

        // Calculating the length of linked list
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Iterating till next is not NULL
        while (next != null) {
            curr = prev.next; // Curr position after every
            // reverse group
            next = curr.next; // Next will always next to
            // curr
            int toLoop
                = count > k
                ? k
                : count - 1; // toLoop will set to
            // count - 1 in case of
            // remaining element

            for (int i = 1; i < toLoop; i++) {
                // 4 steps as discussed above
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr; // Setting prev to curr
            count -= k; // Update count
        }
        return dummy.next; // dummy -> next will be our new
        // head for output linked
        // list
    }
    // utility function to print the list
    static void print(Node1 head)
    {
        while (head.next != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String args[])
    {
        Node1 head = null;
        int k = 3;
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 5);
        head = push(head, 6);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 9);

        System.out.println("Given Linked List");
        print(head);
        System.out.println("Reversed list");
        Node1 newHead = reverse(head, k);
        print(newHead);
    }
}
