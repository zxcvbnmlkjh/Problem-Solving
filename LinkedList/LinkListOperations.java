public class LinkListOperations {
     Node head;
     Node temp;
     int count;
     Node headNew;

     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkListOperations operations = new LinkListOperations();
        operations.insert(1);
        operations.insert(2);
        operations.insert(3);
        operations.insert(4);
        operations.insert(5);
        operations.insert(6);
        operations.printList(operations.head);
        operations.insertAtBeginning(100);

        operations.printList(operations.head);
        operations.headNew = operations.reverseList();
        System.out.println("After reverse");
        operations.printList(operations.headNew);
        System.out.println(operations.count);
        /*operations.reverseKElements(3);
        System.out.println("After reverse");
        operations.printList(operations.headNew);*/

        //operations.reverseListRecursion(operations.headNew);
    }

    public void printList(Node head) {
         count = 0;
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            count++;
        }
        System.out.print("\n");
    }

    public void insert(int data) {
            Node node = new Node(data);

            if(head == null) {
                head = node;
                temp = head;
            } else {
                temp.next = node;
                temp = node;
            }
    }

    public void insertAtBeginning(int data) {
         Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                node.next = head.next;
                head = node;
            }
    }

    public void insertAtEnd() {

    }

    public void insertAtMid(int pos) {

    }

    public void reverseKElements(int k) {
        int p = count - k ;
        int i= 0;

        Node prev = null;
        Node temp = headNew;
        Node node = null;
        while (i < p) {
            temp = temp.next;
            i++;
        }
        prev = temp;
        node= temp.next; // 2
        Node nextPtr = null;
        while(temp != null) {
            temp = node.next;
            temp.next = nextPtr;
            nextPtr = temp;
        }
        prev.next = node;
    }

    public Node reverseList() {
         Node temp = null;
         Node prev = null;
         while(head != null) {
             temp = head;
             head = head.next;
             temp.next = prev;
             prev = temp;
        }
         return temp;
    }

//    public Node reverseListRecursion(Node head) {
//
//         if(head ==null || head.next == null) {
//             return  head;
//         }
//         Node headNext = reverseListRecursion(head.next);
//
//    }
}
