package PrintEvenOdd;

public class EvenOddMain
{
    public static void main (String[] args)
    {
        EvenOddOperation operation = new EvenOddOperation();
        EvenThread evenThread = new EvenThread(operation);

        OddThread oddThread = new OddThread(operation);
        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);
        t1.start();
        t2.start();

    }
}
