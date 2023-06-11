public class Print1toNUsingRecursion
{
    public static void main (String[] args)
    {
        Print1toNUsingRecursion print = new Print1toNUsingRecursion();
        print.printIncreasingOrder(5);
    }
    public void printIncreasingOrder(int N) {
        if(N ==1) {
            System.out.println(N);
            return;
        }
        printIncreasingOrder(N-1);
        System.out.println(N);
    }
}
