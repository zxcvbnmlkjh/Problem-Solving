/**
 * https://www.enjoyalgorithms.com/blog/implement-least-recently-used-cache
 *
 */
package LRUCache;

public class LRUCacheMain
{
    public static void main (String[] args)
    {
        LRUCacheOperations lru = new LRUCacheOperations();
        lru.put(1, "Priyanka");
        lru.put(2, "Sneha");
        lru.put(3, "Naina");
        lru.put(4, "Seema");
        System.out.println(lru.get(1)); // this value has been removed from cache
        System.out.println(lru.get(3));
    }
}
