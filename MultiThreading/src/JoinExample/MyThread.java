package JoinExample;

public class MyThread implements Runnable
{
    @Override public void run ()
    {
        try {
            Thread.sleep(5000);
            System.out.println("My thread ending");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
