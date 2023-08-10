public class PrintingResource
{
    public static void print (String message)
    {
        synchronized (PrintingResource.class) {
            System.out.println("{ " + message + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Sleep doesnt release lock
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("}" + Thread.currentThread().getName() + "\n");
        }
    }

}
