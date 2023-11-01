package LRUCache;

public class LRUMultithreadedEnv
{
    public static void main (String[] args) throws InterruptedException
    {
        LRUCacheOperations lru = new LRUCacheOperations();



        Thread t1 = new Thread(() ->
        {
            lru.put(1, "Priyanka");
            lru.put(2, "Sneha");
            lru.put(3, "dsds");
            lru.put(1, "jkjkji");
        });

        t1.start();

        t1.join();
        Thread t2 = new Thread(() ->
            lru.get(1));
        t2.start();
    }

}
