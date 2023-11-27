/**
 * I have created 2 user accounts user1 and user2, User Object is the Lock here.
 *
 * There are 2 threads t1 and t2 which are working on User1
 *
 * Thread t3 is working on User2. User Object is stored in map based on userId we will try to get object from map
 * and take lock on that object.
 *
 *
 */
package BankingApp_LLD;

public class BankMain
{
    public static void main (String[] args) throws InterruptedException
    {
        User user1 = new User(1, "Priyanka", "Bangalore", 10000);
        User user2 = new User(2, "Ankita", "Delhi", 10000);

        AccountOperations accountOperations = new AccountOperationsImpl();
        System.out.println(accountOperations.createAccount(user1));
        System.out.println(accountOperations.createAccount(user2));

        Thread t1 = new Thread(() -> {
            for(int i =0 ; i<5; i++) {
                System.out.println(accountOperations.deposit(1, 10000L));
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<2; i++) {
                System.out.println(accountOperations.withdraw(1, 20000L));
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i=0; i<5; i++) {
                System.out.println(accountOperations.deposit(2, 10000L));
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t3.start();

        t2.join();
        t3.join();

        System.out.println("Amount balance is for 1=== " + accountOperations.getBalance(1));
        System.out.println("Amount balance is 2== " + accountOperations.getBalance(2));
    }

}
