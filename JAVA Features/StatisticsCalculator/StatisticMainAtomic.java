package StatisticsCalculator;

public class StatisticMainAtomic
{
    public static void main (String[] args)
    {
        StatisticsImplUsingAtomic statistics = new StatisticsImplUsingAtomic();
        for(int i=1; i<=100; i++) {
            statistics.event(i);
        }
        System.out.println("Minimum value is"+ statistics.minimum());
        System.out.println("Maximum value is"+ statistics.maximum());
    }
}
