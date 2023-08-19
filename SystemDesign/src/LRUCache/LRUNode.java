package LRUCache;

public class LRUNode
{
    int key;
    String value;
    LRUNode prev;
    LRUNode next;

    public int getKey ()
    {
        return key;
    }

    public void setKey (int key)
    {
        this.key = key;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
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
