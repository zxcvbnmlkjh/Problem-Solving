package Without_Locks;

public class Adder implements Runnable
{
    CounterVal counterVal;
    Adder(CounterVal counterVal) {
        this.counterVal = counterVal;
    }

    @Override public void run ()
    {
        for (int i=0 ;i < 1000; i++){
            counterVal.counter ++;
        }
    }
}
