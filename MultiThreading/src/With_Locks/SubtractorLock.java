package With_Locks;

import java.util.concurrent.locks.Lock;

public class SubtractorLock implements Runnable
{
    CounterVal counterVal;
    Lock lock;

    SubtractorLock(CounterVal counterVal, Lock lock) {
        this.counterVal = counterVal;
        this.lock = lock;
    }

    @Override
    public void run ()
    {
       /* lock.lock();
        for (int i=0 ;i < 1000; i++){
            counterVal.counter--;
        }
        lock.unlock();*/

        // Optimized Way  *** Putting lock at just on the critical section.
        for (int i=0 ;i < 1000; i++){
            lock.lock();
            counterVal.counter--;
            lock.unlock();
        }

    }
}
