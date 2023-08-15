package ProducerConsumer;

public class ProducerConsumerMain
{
    public static void main (String[] args)
    {
        ProducerConsumerOperation operation = new ProducerConsumerOperation();
        Producer producer = new Producer(operation);
        Consumer consumer = new Consumer(operation);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
