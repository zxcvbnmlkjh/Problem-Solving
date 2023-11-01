package TypesOfLocking.ObjectLevelLocking;

public class ObjectThread_Main
{
    public static void main (String[] args)
    {
        ObjectThread_Main obj = new ObjectThread_Main();
        ObjectThread_Main obj1 = new ObjectThread_Main();

        ThreadClass1 threadClass1 = new ThreadClass1(obj);
        ThreadClass1 threadClass2 = new ThreadClass1(obj);

        // Here we are using different instance object and lock is on obj so this thread will interfere.
        ThreadClass2 threadClass3 = new ThreadClass2(obj1);

        Thread t1 = new Thread(threadClass1);
        Thread t2 = new Thread(threadClass2);
        Thread t3 = new Thread(threadClass3);
        // If we create another thread using different object this thread will interfere in t1 and t2.

        t1.start();
        t2.start();
        t3.start();
    }

    // This is Object level Locking i have taken lock on obj. T1 and T2 will not interfere
    public void test() {
        synchronized(this) {
            for (int i = 0; i < 100; i++) {
                System.out.println(
                    "M in thread" + Thread.currentThread().getName() + "  Value is  " + i);
            }
        }
    }
}
