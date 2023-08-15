package PrintEvenOdd;

public class OddThread implements Runnable
{
    EvenOddOperation operation;

    OddThread (EvenOddOperation operation) {
        this.operation = operation;
    }

    @Override public void run ()
    {
        try {
            operation.printOdd();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
