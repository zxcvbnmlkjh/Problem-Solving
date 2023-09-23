public class ArrayImplementationQueue
{
    private int capacity;
    private int[] arr;
    private int front,rear, count;
    ArrayImplementationQueue (int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        front = -1;
        rear = -1;
        count = 0;
    }
    public static void main (String[] args)
    {
        ArrayImplementationQueue arrayQueue = new ArrayImplementationQueue(10);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add( 3);
        System.out.println("Value removed is: " + arrayQueue.remove());
        arrayQueue.add(4);
        arrayQueue.add(5);
        System.out.println("Value removed is: " + arrayQueue.remove());
        System.out.println("Value removed is: " + arrayQueue.remove());
    }

    // Add element to the queue
   public void add (int val) {
        if(front == -1 && rear == -1) {
            arr[0] = val;
            front ++;
            rear ++;
            count ++;
        } else {
            if(count < capacity ) {
                 rear = rear+ 1 % capacity;
                 arr[rear] = val;
                 count ++;
            } else {
                System.out.println("Stack overflowww");
            }
        }
   }

    // Return top of the queue
    public int get () {
        return arr[front];
    }

    // Remove top of the queue
    public int remove () {
        int val = arr[front];
        front ++;
        return val;
    }

}
