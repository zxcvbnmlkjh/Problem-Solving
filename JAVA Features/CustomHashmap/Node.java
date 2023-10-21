package CustomHashmap;

import java.util.Objects;

public class Node<K,V>
{
    K key;
    V value;
    public Node next;

    Node(K key, V value, Node node) {
        this.key = key;
        this.value = value;
        this.next = node;
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

    public Node getNext ()
    {
        return next;
    }

    public void setNext (Node next)
    {
        this.next = next;
    }

}
