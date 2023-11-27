package PrintEvenOdd;

public class PrintEvenOddUsingLambda
{
    int count = 1;
    public static void main (String[] args)
    {
        PrintEvenOddUsingLambda printEvenOddUsingLambda = new PrintEvenOddUsingLambda();
        Thread t1 = new Thread(() -> {
            printEvenOddUsingLambda.printOdd();
        });

        Thread t2 = new Thread(() -> {
            printEvenOddUsingLambda.printEven();
        });

        t1.start();
        t2.start();
    }

    public void printOdd ()
    {
        synchronized (this) {
            System.out.println("Object is:     "+ this);
            while (count < 100) {
                if(count % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Printing Odd:" + count + "   Thread name is:" + Thread.currentThread().getName());
                count++;
                notifyAll();
            }
        }
    }

    public void printEven ()
    {
        synchronized (this) {
            System.out.println(" Even Object is:  "+ this);
            while (count < 100) {
                if(count % 2 != 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Printing Even:" + count + "   Thread name is:" + Thread.currentThread().getName());
                count++;
                notifyAll();
            }
        }
    }
}
