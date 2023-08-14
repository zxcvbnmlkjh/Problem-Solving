package StatisticsCalculator;

import java.util.concurrent.atomic.AtomicInteger;

public class StatisticsImplUsingAtomic implements Statistic
{
    AtomicInteger intMin = new AtomicInteger(Integer.MAX_VALUE);
    AtomicInteger intMax = new AtomicInteger(Integer.MIN_VALUE);

    @Override
    public void event (int value)
    {
        if(value<intMin.get()) {
            intMin.getAndSet(value);
        }

        if(value>intMax.get()) {
            intMax.getAndSet(value);
        }
    }

    @Override public float mean ()
    {
        return 0;
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
