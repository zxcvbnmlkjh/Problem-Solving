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
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        ReverseListUsingK solution = new ReverseListUsingK();

        int len = solution.calculateLength(node1);
        solution.printList(node1);
        System.out.println(len);
        solution.reverseList(len, 3, node1);
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

    public void reverseList (int length, int k, NodeList head) {

        int limit = length/k;
        int count = 0;
        NodeList temp = head;
        NodeList prev = null;
        NodeList lastPtr = temp;
        NodeList nextRef = null;
        NodeList newNode = null;
        int i=0;
        while (count < limit && temp.next != null) {
            lastPtr.next = nextRef;
            i = 0;
            while (i < k) {  // 0. 1 2
                System.out.println(temp.data);
                System.out.println(temp.next);
                newNode = temp;  // 1. // 2
                newNode.next = prev;   //      2 --> prev == 1--> null
                prev = newNode;   // 2 --> 1 -->.    3 --->   2 --> 1
                temp = temp.next;  // 2 // 3
                i++;
            }
            count++;  // 1
            nextRef = prev;
        }

        if(temp != null) {
            prev.next = temp;
        }
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
