public class LoopInLinkList {

    Node head;
    Node temp;
    public static void main(String[] args) {
        LoopInLinkList loop = new LoopInLinkList();
        loop.insert(1);
        loop.insert(2);
        loop.insert(3);
        loop.insert(4);
        loop.insert(5);
        loop.insertLoop(6);
        System.out.println("Loop exist:"+ loop.checkLoop());
        String s = "Priyanka";
        s.length();

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

    public void insertLoop(int data) {

        Node node = new Node(data);
        temp.next = node;
        node.next = head;
    }

    public boolean checkLoop () {
        Node slowptr = head;
        Node fastptr = head;
        int flag = 0;
        while(fastptr != null && slowptr !=null && fastptr.next !=null)  {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr) {
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            return  true;
        }else {
            return false;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data){
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
}
