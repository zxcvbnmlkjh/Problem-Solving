/**
 * We are not using any locks here in thread1 and thread 2 which is causing incosistency in the data.
 *
 * In this what is has happened is Adder thread is working on counter variable and it has incremented
 * the value but have not saved it back to RAM, meanwhile other thread subtractor came and tried to reduce the value.
 * Thats why we got inconsistent data.
 *
 * This problem is called as Synchronisation problem
 *
 * We need to use some technique which will ensure that at one point of time there is
 * only one thread working on critical section of code. Those techniques are
 *
 * Mutex
 * Synchronisation
 * Atomic
 *
 */
package Without_Locks;

public class Client
{
    public static void main (String[] args)
    {
        CounterVal counterVal = new CounterVal();

        Adder adder = new Adder(counterVal);
        Subtractor subtractor = new Subtractor(counterVal);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();
        System.out.println("Value of counter is:"+ counterVal.counter);
    }
}
