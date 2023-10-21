package ObjectPool;

public class ObjectPoolMain
{
    public static void main (String[] args)
    {
        ObjectPoolInterface objectPoolInterface = new ObjectPoolImpl();
        Personn person1 = new Personn(1, "Priyanka", "ABH");
        Personn person2 = new Personn(2, "Sneha", "Delhi");
        Personn person3 = new Personn(3, "Ankita", "GZB");
        Personn person4 = new Personn(4, "Ankita", "GZB");
        objectPoolInterface.addObject(1, person1);
        objectPoolInterface.addObject(2, person2);
        objectPoolInterface.addObject(3, person3);
        objectPoolInterface.addObject(4, person4);
        objectPoolInterface.addObject(1, person1);
        System.out.println(objectPoolInterface.getObject(2));
        System.out.println(objectPoolInterface.getObject(1));
        System.out.println(objectPoolInterface.getObject(2));

    }
}
