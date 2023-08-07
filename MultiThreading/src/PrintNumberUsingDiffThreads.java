public class PrintNumberUsingDiffThreads implements Runnable
{
    int num;
    PrintNumberUsingDiffThreads (int num) {
        this.num = num;
    }


    // This way it will give us Race condition l
    @Override public void run ()
    {
        System.out.println("Current running thread is: "+ Thread.currentThread().getName() + " " + num);
        num++;
    }
}
