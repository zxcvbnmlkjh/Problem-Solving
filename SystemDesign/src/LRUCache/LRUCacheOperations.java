/**
 * Instead of using Customized Doubly linked list i can use dequeue as well where i can store keys.
 * Refer Object pool for this.
 */
package LRUCache;

import org.w3c.dom.Node;

import java.util.HashMap;

public class LRUCacheOperations<K,V>
{
    LRUNode head;
    LRUNode tail;

    HashMap<K, LRUNode> lruMap = new HashMap();

    LRUCacheOperations ()
    {
        head = new LRUNode();
        tail = new LRUNode();
        head.setPrev(null);
        head.setNext(tail);
        tail.setNext(null);
        tail.setPrev(head);
    }

    public void put (K key, V value)
    {
        System.out.println("M in put method and thread name is:" + Thread.currentThread().getName());
        LRUNode node = lruMap.get(key);
        System.out.println("Node obj:" + node);
            if (node == null) {
                if (lruMap.size() < 3) {
                    LRUNode newNode = new LRUNode(key, value);
                    addFront(newNode);
                    lruMap.put(key, newNode);
                }
                else {
                        LRUNode newNode = new LRUNode(key, value);
                        removeTail(tail.prev);
                        addFront(newNode);
                        lruMap.remove(tail.prev.getKey());
                        lruMap.put(key, newNode);
                }
            }
            else {
                synchronized (node) {
                    node.setValue(value);
                    removeTail(node);
                    addFront(node);
                }
            }
    }

    public V get (K key)
    {
        LRUNode node = lruMap.get(key);
        System.out.println("Node obj:" + node);
        synchronized (node) {
            System.out.println("M in get method and thread name is:" + Thread.currentThread().getName());
            if (node == null) {
                return null;
            }
            else {
                removeTail(node);
                addFront(node);
            }
            return (V) node.getValue();
        }
    }

    public void removeTail (LRUNode node) {
        LRUNode prevNode= node.getPrev();
        prevNode.setNext(null);
    }

    public void addFront (LRUNode node) {

        LRUNode nextNode = head.getNext();
        head.setNext(node);
        node.setPrev(head);
        node.setNext(nextNode);
        nextNode.setPrev(node);
    }
}

