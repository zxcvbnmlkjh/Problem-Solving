public class SingletonMain
{
    public static void main (String[] args)
    {
        SingletonDesignPattern sObj = SingletonDesignPattern.getObj();
        System.out.println(sObj.hashCode());
        sObj.greetMsg();
        SingletonDesignPattern sObj1 = SingletonDesignPattern.getObj();
        System.out.println(sObj1.hashCode());
        sObj1.greetMsg();
    }
}
