/**
 * Creating threads using Lambda expression and using common String objects to take lock on.
 *
 * Thread1 took a lock on firstName Obj and Thread2 took lock on LastName obj. Thread1 trying to take lock on lastName
 * Thread 2 trying to take lock on lastName which will lead to Deadlock state
 *
 * To avoid deadlock try not to use nested loops. If we change the order of firstName and lastname in threads. Dealock will be removed.
 */
package DeadLock;

public class DeadLockUsingLambdaExpression
{

    public static void main (String[] args)
    {
         String firstName = "Priyanka";
         String lastName = "Taneja";
        //Thread t1 = new Thread(() -> System.out.println("M in Thread 1"));
        //Thread t2 = new Thread(() -> System.out.println("M in Thread 2"));

        Thread t1 = new Thread(() -> {
            synchronized (firstName) {
                System.out.println(Thread.currentThread().getName() + "  took lock on firstName");
                synchronized (lastName) {
                    System.out.println(Thread.currentThread().getName() + "  took lock on lastName");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lastName) {
                System.out.println(Thread.currentThread().getName() + "  took lock on lastName");
                synchronized (firstName) {
                    System.out.println(Thread.currentThread().getName() + "  took lock on firstName");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
