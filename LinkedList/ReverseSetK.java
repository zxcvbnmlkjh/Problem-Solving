/**
 * Reverse in a set of K
 *
 * Approach -- We call recursive calls with head and then we need to connect prev to head.next.
 * We return Prev node and attach head to it.
 * so we connect head.next = reverse (next, K)
 * return prev;
 *
 * This solution has 2 parts,
 *
 *  Part 1 - To keep track of k we first calculate the count if count == 2 then only we perform Reverse
 *  else we return head. and we attach that head to the reversed part as it is.
 *
 *  Part 2 - Normal reverse in group of K if count < K.
 *
 * Reverse(5)
 * Reverse(3)
 * Reverse(1)
 */

public class ReverseSetK
{
    public static void main (String[] args)
    {
        Noode node1 = new Noode(1);
        Noode node2 = new Noode(2);
        Noode node3 = new Noode(3);
        Noode node4 = new Noode(4);
        Noode node5 = new Noode(5);
        Noode node6 = new Noode(6);
        Noode node7 = new Noode(7);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(null);

        ReverseSetK reverseLinkListInSetK = new ReverseSetK();
        Noode res = reverseLinkListInSetK.reverse(node1, 2);
        reverseLinkListInSetK.printList(res);

    }

    public int calculateLength (Noode node)
    {
        Noode temp = node;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Noode reverse (Noode head, int K) {
        Noode prev = null;
        int count= 0;
        Noode temp = head;

        // To keep track of k we first calculate the count if count == 2 then only we perform Reverse
        // else we return head. and we attach that head to the reversed part as it is.
        while(count<K && temp != null) {
            count++;
            temp = temp.next;
        }
        if(count< K) {
            return head;
        } else {
            prev = null;
            Noode curr = head;
            Noode next = null;
            int limit = K;
            while (limit > 0) {
                next = curr.next;
                //System.out.println("Next data is:"+ next.data);
                curr.next = prev;
                prev = curr;
                curr = next;
                limit--;
            }

            head.next = reverse(next, K);
            return prev;
        }
    }

    public void printList(Noode temp) {
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Noode {
    int data;
    Noode next;
    Noode(int data) {
        this.data = data;
    }

    public int getData ()
    {
        return data;
    }

    public void setData (int data)
    {
        this.data = data;
    }

    public Noode getNext ()
    {
        return next;
    }

    public void setNext (Noode next)
    {
        this.next = next;
    }
}

