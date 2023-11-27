package ProducerConsumer;

public class ProducerConsumerLambda
{
    int counter = 0;
    public static void main (String[] args)
    {
        ProducerConsumerLambda producerConsumerLambda = new ProducerConsumerLambda();
        Thread producer = new Thread(() -> {
            try {
                producerConsumerLambda.produce();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                producerConsumerLambda.consume();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

    }

    public void produce () throws InterruptedException
    {
            while (true) {
                synchronized (this) {
                if(counter == 5) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter++;
                System.out.println(Thread.currentThread().getName() + "  Produceddd");
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume () throws InterruptedException
    {
            while(true) {
                synchronized (this) {
                if(counter == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter--;
                System.out.println(Thread.currentThread().getName() + "  Consumedd");
                notify();
                Thread.sleep(1000);
            }
        }

    }
}
