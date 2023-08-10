// Use of synchornisation to keep member variable thread safe

public class SynchronizationExample
{
    public static void main (String[] args)
    {
        PrintingResource printingResource = new PrintingResource();
        PrintingThread pt = new PrintingThread(printingResource, "Hello");
        PrintingThread pt1 = new PrintingThread(printingResource, "Bye");
        PrintingThread pt2 = new PrintingThread(printingResource, "Final bye");

        Thread t1 = new Thread(pt);
        Thread t2 = new Thread(pt1);
        Thread t3 = new Thread(pt2);
        t1.start();
        t2.start();
        t3.start();
    }
}
