package With_Locks;

import java.util.concurrent.locks.Lock;

public class AdderLock implements Runnable
{
    CounterVal counterVal;
    Lock lock;
    AdderLock(CounterVal counterVal, Lock lock) {
        this.counterVal = counterVal;
        this.lock = lock;
    }

    @Override public void run ()
    {
        /*lock.lock();
        for (int i=0 ;i < 1000; i++){
            counterVal.counter ++;
        }
        lock.unlock();*/

       // Optimized Approach

        for (int i=0 ;i < 1000; i++){
            lock.lock();
            counterVal.counter ++;
            lock.unlock();
        }

    }
}
