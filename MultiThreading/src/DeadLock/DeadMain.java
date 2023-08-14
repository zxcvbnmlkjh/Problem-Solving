package DeadLock;

public class DeadMain
{
    public static void main (String[] args)
    {
        String name = "Priyanka";
        String add = "Abohar";
        DeadThread1 thread1 = new DeadThread1(name, add);
        DeadThread2 thread2 = new DeadThread2(name, add);
        Thread t = new Thread(thread1);
        Thread t1 = new Thread(thread2);
        t.start();
        t1.start();

    }
}
