package StatisticsCalculator;

public class StatisticMainAtomic
{
    public static void main (String[] args) throws InterruptedException
    {
        StatisticsImplUsingAtomic statistics = new StatisticsImplUsingAtomic();

        Thread t1 = new Thread( new Runnable() {
            @Override public void run ()
            {
                for(int i=1;i<=1000;i++) {
                    statistics.event(i);
                }
            }
        });

        Thread t2 = new Thread( new Runnable() {
            @Override public void run ()
            {
                for(int i=1;i<=1000;i++) {
                    statistics.event(i);
                }
            }
        });

        t1.start();
        t2.start();
        // Here I have added joins so that current thread can complete its execution.
        t1.join();
        t2.join();
        System.out.println("Minimum value is"+ statistics.minimum());
        System.out.println("Maximum value is"+ statistics.maximum());
        System.out.println("Maximum value is"+ statistics.mean());
        System.out.println("Maximum value is"+ statistics.variance());
    }
}
