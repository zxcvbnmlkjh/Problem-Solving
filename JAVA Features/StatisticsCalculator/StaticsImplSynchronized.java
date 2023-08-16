/**
 * This is the implementation class for Statistic
 * I have used Object Level Locking and I have taken lock on StaticsImplSynchronized object.
 */
package StatisticsCalculator;

import java.util.ArrayList;
import java.util.List;

public class StaticsImplSynchronized implements Statistic
{
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;
    private int sum = 0;
    private int count = 0;
    private float mean = 0;
    private float variance = 0;
    List<Integer> integerList = new ArrayList<>();

    @Override public void event (int value)
    {
        // Object level locking
        synchronized (this) {
            integerList.add(value);
            sum = sum + value;
            count++;
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
    }

    @Override public float mean ()
    {
        mean = sum/count;
        return mean;
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
        for (int i = 0; i < integerList.size(); i++) {
            variance += Math.pow(integerList.get(i) - mean, 2);
        }
        variance /= integerList.size();
        return variance;
    }
}
