package CustomHashmap;

public class HashmapOperations<K,V>
{
    Node[] entryArray;
    Node entryObj;
    int capacity = 10;

    HashmapOperations () {
        
    }

    public void put(K key, V value) {

        // find index
        // if array index is empty create new entryobj and add it to index
        // if not empty get entryobj at index and using equals if both are equal update the value

        int index = getIndex(key, capacity);

        if(entryArray[index] == null) {
            entryObj = new Node<>(key, value, null);
            entryArray[index] = entryObj;
        }else {
            Node temp = entryArray[index];
            Node end = null;
            boolean added = false;
            while(temp != null && !added){
                if(temp.key == key) {
                    temp.value = value;
                    added = true;
                    break;
                }
                end = temp;
                temp = temp.next;
            }
            if(!added) {
                end.next = temp;
            }
        }
    }

    public V get (K key) {
            // get index
        int index = getIndex(key, capacity);
        if(entryArray[index] == null) {
            return null;
        } else {
            Node entry = entryArray[index];
            while (entry != null) {
                if(entry.getKey() == key) {
                    return (V) entry.getValue();
                }
            }
            return null;
        }
    }

    public int getIndex (K key, int size) {
        return key.hashCode() % size;
    }
}
