package TypesOfLocking.ObjectLevelLocking;

public class ThreadClass1 implements Runnable
{
    ObjectThread_Main objectThread_main;

    ThreadClass1 (ObjectThread_Main objectThread_main) {
        this.objectThread_main = objectThread_main;
    }

    @Override
    public void run ()
    {
        objectThread_main.test();
    }
}
