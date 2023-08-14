/**
 * We need to use some technique which will ensure that at one point of time there is
 * only one thread working on critical section of code. Those techniques are
 *
 * Mutex
 * Synchronisation
 * Atomic
 *
 * In this example we are using Locks and we are using single lock in both Adder and Subtracter and
 * M passing the reference of Lock in both the classes and that why when thread 1 is taking the lock
 * Thread 2 is not allowed to take the lock
 *
 */
package With_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ClientLock
{
    public static void main (String[] args) throws InterruptedException
    {
        CounterVal counterVal = new CounterVal();
        Lock lock = new ReentrantLock();
        AdderLock adder = new AdderLock(counterVal, lock);
        SubtractorLock subtractor = new SubtractorLock(counterVal, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join(); // With this we are telling main thread to wait for printing sout till t1 completes it processing.
        t2.join(); // With this we are telling current thread (main) to wait for printing sout till t2 completes it processing.

        System.out.println("Value of counter is:"+ counterVal.counter);
    }
}
