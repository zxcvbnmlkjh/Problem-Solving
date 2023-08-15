package StatisticsCalculator;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StatisticsSynchronized_Main
{
    public static void main (String[] args) throws InterruptedException
    {
        StaticsImplSynchronized staticsImplSynchronized = new StaticsImplSynchronized();

        for(int i=0; i<100; i++) {
            Thread t = new Thread( new Runnable() {

                @Override public void run ()
                {
                    Random random = new Random();
                    int randomNumber = random.nextInt(1000);
                    staticsImplSynchronized.event(randomNumber);
                }
            });
            t.start();
        }
      /*  Thread t1 = new Thread(staticsImplSynchronized);
        Thread t2 = new Thread(staticsImplSynchronized);

        t1.start();
        t2.start();

        t1.join();
        t2.join();*/
        System.out.println("Min Value is:"+ staticsImplSynchronized.minimum());
        System.out.println("Max Value is:"+ staticsImplSynchronized.maximum());
        System.out.println("Mean Value is:"+ staticsImplSynchronized.mean());
    }
}
