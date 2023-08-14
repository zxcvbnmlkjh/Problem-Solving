package DeadLock;

public class DeadThread2 implements Runnable
{
    String name;
    String add;

    DeadThread2 (String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override
    public void run ()
    {
        System.out.println("Started thread T2");
        synchronized (add) {        // If we change the order of resources deadlock will be removed.
            System.out.println("Aquired First T2");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (name){
                System.out.println("Aquired Second T2");
            }
        }
        System.out.println("Completed T2");
    }
}
