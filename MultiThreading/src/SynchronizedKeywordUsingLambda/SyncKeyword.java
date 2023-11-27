/**
 *  These threads are created with different objects. t1 and t2 are created from same
 *  so we can use object level locking for this. t1 and t2 will not interfer in each other
 *
 *  t3 will interfer in t1 and t2 as it is created from different obj.
 *
 *  for all three threads so they dont interfere in each other we can use class level locking.
 *
 *  When we use static sync it uses class level locking and all 3 threads will not interfere in each other
 *  When we use nou synchronized without static t1 and t2 created from same obj will not intefere. t3 will interfere
 */
package SynchronizedKeywordUsingLambda;

public class SyncKeyword
{
    public static void main (String[] args)
    {
        SyncKeyword syncKeyword = new SyncKeyword();
        SyncKeyword syncKeyword1 = new SyncKeyword();
        Thread t1 = new Thread(() -> {
            for(int i =0; i<20; i++) {
                syncKeyword.printData(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i =0; i<20; i++) {
                syncKeyword.printData(i);
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i =0; i<20; i++) {
                syncKeyword1.printData(i);
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

    // When we use static sync it uses class level locking and all 3 threads will not interfere in each other
    // When we use nou synchronized without static t1 and t2 created from same obj will not intefere. t3 will interfere
    public static synchronized void printData (int i) {
        System.out.println("Thread name:" + Thread.currentThread().getName() + " " + i);
    }

}
