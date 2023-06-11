public class FibNoUsingRecursion
{
    public static void main (String[] args)
    {
        FibNoUsingRecursion fibNoUsingRecursion = new FibNoUsingRecursion();
        System.out.println("Fib num for N is " + fibNoUsingRecursion.fibNumber(6));
    }

    public int fibNumber(int N) {
        if(N<=1){
            return N;
        }
        return fibNumber(N-1) + fibNumber(N-2);
    }
}
