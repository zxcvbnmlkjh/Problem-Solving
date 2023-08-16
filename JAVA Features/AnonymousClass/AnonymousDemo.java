/**
 * Inner Nested Class which doesnt have a name
 * Normally we use to provide implementation class for an interface.
 *
 */
package AnonymousClass;

public class AnonymousDemo
{
    Integer count = 0;
    public static void main (String[] args) throws InterruptedException
    {
        AnonymousDemo anonymousDemo = new AnonymousDemo();

        Thread t1 = new Thread(new Runnable()
        {
            @Override public void run ()
            {
                for(int i=0; i<10; i++) {
                    anonymousDemo.test();
                }
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override public void run ()
            {
                for(int i=0; i<10; i++) {
                    anonymousDemo.test();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Value od count is:"+ anonymousDemo.count);
    }

    public void test () {
        synchronized (count) {
            count++;
            System.out.println("thread name is:   "+ Thread.currentThread().getName()+ "Count is  "+ count);

        }
    }
}
