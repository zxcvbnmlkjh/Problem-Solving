package CustomHashmap;

public class HashMapMain
{
    public static void main (String[] args)
    {
        HashmapOperations hashmapOperations = new HashmapOperations(10);
        hashmapOperations.put(1, "Priyanka");
        hashmapOperations.put(2, "Sneha");
        hashmapOperations.put(3, "Ankita");
        hashmapOperations.put(1, "Taneja");
        System.out.println(hashmapOperations.get(1));
    }
}
