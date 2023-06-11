public class PrintNTo1UsingRecursion
{
    public static void main(String[] args) {
        PrintNTo1UsingRecursion printNTo1UsingRecursion = new PrintNTo1UsingRecursion();
        printNTo1UsingRecursion.print(10);
    }
    void print(int N) {
        if(N < 1) {
            return;
        }
        System.out.print(N + " ");
        print(N-1);
    }
}
