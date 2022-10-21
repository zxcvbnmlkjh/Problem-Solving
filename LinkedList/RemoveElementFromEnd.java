public class RemoveElementFromEnd
{
    ListNode head;
    ListNode temp;
    public static void main(String[] args) {
        RemoveElementFromEnd listTest = new RemoveElementFromEnd();
        listTest.insert(1);
        listTest.insert(2);
        listTest.printList();
        listTest.removeNthFromEnd(listTest.head, 1);
        listTest.printList();
    }

    public void insert(int data) {
        ListNode node = new ListNode(data);

        if(head == null) {
            head = node;
            temp = head;
        } else {
            temp.next = node;
            temp = node;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {



        int count = 0;
        ListNode temp = head;
        while(temp != null) {
                temp = temp.next;
                count++;
            }
        if(head ==null || count==1){
            return null;
        }

        int pos = count -n +1 ;   // 5-2 = 3+1

        // 1 2 3 4 5
        ListNode slow = head;
        for(int i=1;i<pos-1;i++){   // 1 2 3
            slow = slow.next;     //
        }
        slow.next = slow.next.next;
       return head;
        }

        public void printList () {
            int count = 0;
            ListNode temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
            }
            System.out.print("\n");
        }
    }

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

