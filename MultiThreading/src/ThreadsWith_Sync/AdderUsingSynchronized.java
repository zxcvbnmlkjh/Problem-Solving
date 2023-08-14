package ThreadsWith_Sync;

import java.util.concurrent.locks.Lock;

public class AdderUsingSynchronized implements Runnable
{
    CounterVal_Sync counterVal;
    Lock lock;
    AdderUsingSynchronized(CounterVal_Sync counterVal, Lock lock) {
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
            synchronized (counterVal) {
                counterVal.counter++;
            }
        }

    }
}
