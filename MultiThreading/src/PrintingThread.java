public class PrintingThread implements Runnable
{
    PrintingResource printingResource; // Thread is working on this member variable

    private String message;

    PrintingThread (PrintingResource printingResource, String msg) {
        this.printingResource = printingResource;
        this.message = msg;
    }
    @Override public void run ()
    {
        printingResource.print(message);
    }
}
