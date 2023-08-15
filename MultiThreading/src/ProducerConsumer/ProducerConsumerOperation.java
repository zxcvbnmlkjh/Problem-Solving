package ProducerConsumer;

import java.util.LinkedList;

public class ProducerConsumerOperation
{
    LinkedList list = new LinkedList();
    int size = 5;
    public void produce () throws InterruptedException
    {
        int val = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == size) {
                    wait();
                }
                list.add(val++);
                System.out.println("Produced+ " + Thread.currentThread().getName() + "List size is:  " + list.size());
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume () throws InterruptedException
    {
        while(true) {
            synchronized (this) {
                while(list.size() == 0) {
                    wait();
                }
                list.removeFirst();
                System.out.println("Consuming+ " + Thread.currentThread().getName() + "List size is:  " + list.size());
                notify();
                Thread.sleep(1000);
            }
        }

    }
}
