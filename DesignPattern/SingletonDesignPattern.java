/**
 * This is thread safe singelton where we have used Double checked Locking
 */
public class SingletonDesignPattern
{
    private static SingletonDesignPattern singletonObj;

    private SingletonDesignPattern() {

    }
    public static SingletonDesignPattern getObj () {

    /*    if(singletonObj == null) {
            singletonObj = new SingletonDesignPattern();
        }
        return singletonObj;
*/
        // Double checked Locking

        if(singletonObj == null) {
            synchronized (SingletonDesignPattern.class) {
                if(singletonObj == null) {
                    singletonObj = new SingletonDesignPattern();
                }
            }
        }
        return singletonObj;
    }
    public void greetMsg () {
       System.out.println("M in Singleton");
    }
}
