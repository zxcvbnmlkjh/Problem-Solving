package StatisticsCalculator;

public class StaticsImplSynchronized implements Statistic, Runnable
{
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;
    private int sum = 0;
    private int count = 0;

    @Override public synchronized void event (int value)   // Object level locking
    {
        sum = sum + value;
        count ++;
        if(value<min) {
            min = value;
        }

        if(value>max) {
            max = value;
        }
    }


    @Override public float mean ()
    {
        System.out.println("Value of sum is:"+ sum);
        System.out.println("Value of count is:"+ count);
        return sum/count;
    }

    @Override public int minimum ()
    {
        return min;
    }

    @Override public int maximum ()
    {
        return max;
    }

    @Override public float variance ()
    {
        return 0;
    }

    @Override public void run ()
    {
        for(int i=1; i<= 100000; i++) {
           event(i);
        }
    }
}
