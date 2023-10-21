public class ReverseListUsingK {

    public static void main(String [] args) {
        System.out.println("This is a debug message");

        NodeList node1 = new NodeList (1, null);
        NodeList node2 = new NodeList (2, null);
        NodeList node3 = new NodeList (3, null);
        NodeList node4 = new NodeList (4, null);
        NodeList node5 = new NodeList (5, null);
        NodeList node6 = new NodeList (6, null);
        NodeList node7 = new NodeList (7, null);
        NodeList node8 = new NodeList (8, null);
        NodeList node9 = new NodeList (9, null);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        ReverseListUsingK solution = new ReverseListUsingK();
        int len = solution.calculateLength(node1);
        solution.printList(node1);
        NodeList res = solution.reverseList(len, 3, node1);
        System.out.println("Print after Reverse");
        solution.printList(res);
    }

    public int calculateLength (NodeList head) {
        NodeList temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void printList (NodeList head) {

        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public NodeList reverseList (int length, int k, NodeList head) {
        int limit = length/k;
        int count = 0;
        NodeList curr = head;
        NodeList prev = null;
        NodeList next = null;
        int i=0;
        NodeList finalRes;
        while (count < limit && curr.next != null) {
            i = 0;
           // prev = null;
            while (i < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                i++;
            }
            count++;
            //head.next = curr;
            //head = curr;
        }
        return prev;
    }
}
class NodeList {
    int data;
    NodeList next;

    NodeList(int data, NodeList next) {
        this.data = data;
        this.next = next;
    }
}
