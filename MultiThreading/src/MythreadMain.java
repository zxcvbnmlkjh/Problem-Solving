public class MythreadMain
{
    public static void main (String[] args) throws InterruptedException
    {
       MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1);
        t1.setDaemon(true);
        t1.start();
        t1.join();
        //Thread.sleep(5000);
        System.out.println("Main thread exiting");
    }
}
