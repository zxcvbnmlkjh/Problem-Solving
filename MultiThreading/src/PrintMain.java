public class PrintMain
{
    public static void main (String[] args)
    {
        System.out.println("Hi in this thread "+ Thread.currentThread().getName());

        /*PrintNumbers p = new PrintNumbers(5);
        Thread t = new Thread(p);
        t.start();*/

        PrintNumberUsingDiffThreads printNumberUsingDiffThreads = new PrintNumberUsingDiffThreads(1);
        for(int i=0; i<50;i++) {
            Thread t = new Thread(printNumberUsingDiffThreads);
            t.start();
        }
        System.out.println("Bye in this thread "+ Thread.currentThread().getName());
    }
}
