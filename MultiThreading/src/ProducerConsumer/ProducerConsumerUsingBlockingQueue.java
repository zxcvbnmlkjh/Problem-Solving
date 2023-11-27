package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue
{
    public static void main (String[] args)
    {
        ProducerConsumerUsingBlockingQueue producerConsumerUsingBlockingQueue = new ProducerConsumerUsingBlockingQueue();
        BlockingQueue queue = new LinkedBlockingQueue();
        Thread producer = new Thread(() -> {
            producerConsumerUsingBlockingQueue.produce(queue);
        });

        Thread consumer = new Thread(() -> {
                producerConsumerUsingBlockingQueue.consume(queue);
        });

        producer.start();
        consumer.start();
    }

    public void produce (BlockingQueue queue) {

        for(int i=0 ; i<100; i++) {
            System.out.println("Producing    " + i);
            queue.add(i);
        }
    }
    public void consume (BlockingQueue queue)
    {
         while(true) {
            try {
                System.out.println("Comsuming  " + queue.take());
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
