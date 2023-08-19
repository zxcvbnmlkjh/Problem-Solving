public class FindMid
{
    FindMid.Node head;
    FindMid.Node temp;
    public static void main(String[] args) {
        FindMid findMid = new FindMid();
        findMid.insert(1);
        findMid.insert(2);
        findMid.insert(3);
        findMid.insert(4);
        findMid.insert(5);
        findMid.insert(6);
        System.out.println("Loop exist:"+ findMid.findMid());
        String s = "Priyanka";
        s.length();

    }

    public void insert(int data) {
        FindMid.Node node = new FindMid.Node(data);
        if(head == null) {
            head = node;
            temp = head;
        } else {
            temp.next = node;
            temp = node;
        }
    }

    public int findMid () {
        FindMid.Node slowptr = head;
        FindMid.Node fastptr = head;
        while(fastptr != null && slowptr !=null && fastptr.next !=null)  {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr.data;
    }

    class Node {
        int data;
        FindMid.Node next;

        Node(int data){
            this.data = data;
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public FindMid.Node getNext() {
            return next;
        }

        public void setNext(FindMid.Node next) {
            this.next = next;
        }
    }
}
