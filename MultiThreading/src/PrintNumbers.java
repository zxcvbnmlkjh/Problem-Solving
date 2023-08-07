public class PrintNumbers implements Runnable
{
    int num;
    PrintNumbers(int num) {
        this.num = num;
    }
    @Override
    public void run ()
    {
        for(int i=0; i< num; i++) {
            System.out.println("M in this thread " + Thread.currentThread().getName() + " " + i);
        }
    }
}
