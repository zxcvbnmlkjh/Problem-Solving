package StatisticsCalculator;

import java.util.concurrent.atomic.AtomicInteger;

public class StatisticsImplUsingAtomic implements Statistic
{
    AtomicInteger intMin = new AtomicInteger(Integer.MAX_VALUE);
    AtomicInteger intMax = new AtomicInteger(Integer.MIN_VALUE);
    AtomicInteger sum = new AtomicInteger(0);
    AtomicInteger count = new AtomicInteger(0);

    @Override
    public void event (int value)
    {
        sum.getAndSet(sum.get() + value);
        count.getAndIncrement();
        if(value<intMin.get()) {
            intMin.getAndSet(value);
        }

        if(value>intMax.get()) {
            intMax.getAndSet(value);
        }
    }

    @Override public float mean ()
    {
        System.out.println("Value of sum is:"+ sum);
        System.out.println("Value of count is:"+ count);
        return sum.get()/count.get();
    }

    @Override public int minimum ()
    {
        return intMin.get();
    }

    @Override public int maximum ()
    {
        return intMax.get();
    }

    @Override public float variance ()
    {
        return 0;
    }

}
