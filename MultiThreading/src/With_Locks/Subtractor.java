package With_Locks;

public class Subtractor implements Runnable
{
    CounterVal counterVal;

    Subtractor(CounterVal counterVal) {
        this.counterVal = counterVal;
    }

    @Override
    public void run ()
    {
        for (int i=0 ;i < 1000; i++){
            counterVal.counter--;
        }
    }
}
