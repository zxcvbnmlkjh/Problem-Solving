/**
 * Anonymous implementation of creating thread.
 */
package DeadLock;

public class DeadLockUsingAnonymousImpl
{

    public static void main (String[] args)
    {
        String firstName = "Priyanka";
        String lastName = "Taneja";
        /*Object o1 = new Object();
        Object o2 = new Object();*/

        Thread t1 = new Thread(new Runnable()
        {
            @Override public void run ()
            {
                System.out.println("Thread started " + Thread.currentThread().getName());
                synchronized (firstName) {
                    System.out.println(Thread.currentThread().getName() + "  took lock on firstName");
                    synchronized (lastName) {
                        System.out.println(Thread.currentThread().getName() + "  took lock on lastName");
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override public void run ()
            {
                System.out.println("Thread started " + Thread.currentThread().getName());

                synchronized (lastName) {
                    System.out.println(Thread.currentThread().getName() + "  took lock on lastName");
                    synchronized (firstName) {
                        System.out.println(Thread.currentThread().getName() + "  took lock on firstName");
                    }
                }

            }
        });

        t1.start();
        t2.start();
    }
}
