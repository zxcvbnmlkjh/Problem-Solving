package ProducerConsumer;

public class Consumer implements Runnable
{
    ProducerConsumerOperation operation;

    Consumer(ProducerConsumerOperation operation) {
        this.operation = operation;
    }
    @Override
    public void run ()
    {
        try {
            operation.consume();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
