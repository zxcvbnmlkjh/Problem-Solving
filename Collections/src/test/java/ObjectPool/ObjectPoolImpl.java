package ObjectPool;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class ObjectPoolImpl implements ObjectPoolInterface
{
    Deque<Integer> q = new LinkedList<>();
    HashMap<Integer, Personn> map = new HashMap<>();
    int size = 3;

    @Override
    public String addObject (int id, Personn p)
    {
        if(map.size() < size) {
            map.put(id, p);
            q.addFirst(id);
        } else {
            int lastId = q.peekLast();
            map.remove(lastId);
            q.removeLast();
            map.put(id, p);
            q.addFirst(id);
        }

        return "Object Added successfully";
    }

    @Override public Personn getObject (int id)
    {
        if(map.containsKey(id)) {
            q.remove(id);
            q.addFirst(id);
            return map.get(id);
        } else {
            return null;
        }
    }
}
