package PrintEvenOdd;

public class EvenOddOperation
{
    static int i = 0;

    public void printEven() throws InterruptedException
    {
            synchronized (this) {
                while (i < 200) {
                    if (i % 2 == 1) {
                        wait();
                    }
                    System.out.println(
                        "Printing Even" + "Thread name " + Thread.currentThread().getName()
                            + " val  " + i);
                    i++;
                    notify();
                }
            }
    }

    public void printOdd () throws InterruptedException
    {
            synchronized (this) {
                while (i < 200) {
                    if (i % 2 == 0) {
                        wait();
                    }
                    System.out.println(
                        "Printing Odd" + "Thread name " + Thread.currentThread().getName()
                            + " val  " + i);
                    i++;
                    notify();
                }
            }
    }

}
