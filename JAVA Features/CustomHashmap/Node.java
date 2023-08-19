package CustomHashmap;

public class EntryObj<K,V>
{
    K key;
    V value;
    EntryObj next;
    EntryObj(K key, V value, EntryObj<K,V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
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

    public EntryObj getNext ()
    {
        return next;
    }

    public void setNext (EntryObj next)
    {
        this.next = next;
    }
}
