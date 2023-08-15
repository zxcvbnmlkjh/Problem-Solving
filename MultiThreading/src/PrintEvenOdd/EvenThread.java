package PrintEvenOdd;

public class EvenThread implements Runnable
{
    EvenOddOperation operation;

    EvenThread (EvenOddOperation operation) {
        this.operation = operation;
    }

    @Override public void run ()
    {
        try {
            operation.printEven();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
