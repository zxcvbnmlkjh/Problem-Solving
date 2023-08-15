package TypesOfLocking.ClassLevelLocking;

public class Mythread2 implements Runnable
{
    ClassLocking_Main classLocking_main;

    @Override public void run ()
    {
        classLocking_main.test1();
    }
}
