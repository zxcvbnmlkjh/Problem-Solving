package DeadLock;

public class DeadThread1 implements Runnable
{
    String name;
    String add;
    DeadThread1 (String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override public void run ()
    {
        System.out.println("Starting T1");
        synchronized (name) {
            System.out.println("Aquired First T1");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (add){
                System.out.println("Aquired Second T1");
            }
        }
        System.out.println("Completed T1");
    }
}
