package StatisticsCalculator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StatisticsSynchronized_Main
{
    public static void main (String[] args) throws InterruptedException
    {
        StaticsImplSynchronized staticsImplSynchronized = new StaticsImplSynchronized();
        Thread t1 = new Thread(staticsImplSynchronized);
        Thread t2 = new Thread(staticsImplSynchronized);

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Min Value is:"+ staticsImplSynchronized.minimum());
        System.out.println("Max Value is:"+ staticsImplSynchronized.maximum());
        System.out.println("Mean Value is:"+ staticsImplSynchronized.mean());
    }
}
