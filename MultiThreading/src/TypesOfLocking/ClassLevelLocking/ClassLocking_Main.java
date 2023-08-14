package TypesOfLocking.ClassLevelLocking;

public class ClassLocking_Main
{
    public static void main (String[] args)
    {
        MyThread1 myThread1 = new MyThread1();
        Mythread2 mythread2 = new Mythread2();
        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(mythread2);
        thread1.start();
        thread2.start();
    }

    // This is class Level locking when you are using synchronized with static method
    // In this scenario all the threads will be blocked only one thread will work at a time.
    public synchronized static void test () {
        for(int i=0; i< 100; i++) {
            System.out.println("Thread name is:"+ Thread.currentThread().getName() + "  M in test");
        }
    }

    public synchronized static void test1 () {
        for(int i=0; i< 100; i++) {
            System.out.println("Thread name is:"+ Thread.currentThread().getName() + " M in test 1");
        }
    }
}
