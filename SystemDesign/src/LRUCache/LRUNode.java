package LRUCache;

public class LRUNode<K,V>
{
    K key;
    V value;
    LRUNode prev;
    LRUNode next;

    LRUNode () {

    }
    LRUNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey ()
    {
        return key;
    }

    public void setKey (K key)
    {
        this.key = key;
    }

    public V getValue ()
    {
        return value;
    }

    public void setValue (V value)
    {
        this.value = value;
    }

    public LRUNode getPrev ()
    {
        return prev;
    }

    public void setPrev (LRUNode prev)
    {
        this.prev = prev;
    }

    public LRUNode getNext ()
    {
        return next;
    }

    public void setNext (LRUNode next)
    {
        this.next = next;
    }
}
