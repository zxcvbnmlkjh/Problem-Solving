package StatisticsCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class StatisticsImplUsingAtomic implements Statistic
{
    AtomicInteger intMin = new AtomicInteger(Integer.MAX_VALUE);
    AtomicInteger intMax = new AtomicInteger(Integer.MIN_VALUE);
    AtomicInteger sum = new AtomicInteger(0);
    AtomicInteger count = new AtomicInteger(0);
    AtomicLong variance = new AtomicLong(0);
    AtomicLong mean = new AtomicLong(0);
    List<Integer> integerList = new ArrayList<>();

    @Override
    public void event (int value)
    {
        integerList.add(value);
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
        mean.getAndSet(sum.get()/count.get());
        return mean.get();
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
        for (int i = 0; i < integerList.size(); i++) {
            double val = variance.get()+ Math.pow(integerList.get(i) - mean.get(), 2);
            variance.getAndSet((long) val);
        }
        return variance.get();
    }

}
