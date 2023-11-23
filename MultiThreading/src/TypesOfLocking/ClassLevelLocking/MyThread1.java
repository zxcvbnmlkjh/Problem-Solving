package TypesOfLocking.ClassLevelLocking;

public class MyThread1 implements Runnable
{
    ClassLocking_Main classLocking_main;

    @Override public void run ()
    {
        try {
            classLocking_main.test();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
