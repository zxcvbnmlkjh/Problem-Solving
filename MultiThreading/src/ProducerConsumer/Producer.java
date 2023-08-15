package ProducerConsumer;

public class Producer implements Runnable
{
    ProducerConsumerOperation operation;

    Producer(ProducerConsumerOperation operation) {
        this.operation = operation;
    }
    @Override
    public void run ()
    {
        try {
            operation.produce();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
