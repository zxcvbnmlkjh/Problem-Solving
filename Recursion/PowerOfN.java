/**
 * We need to find a^N which means 2^4. 2*2*2*2 = 16
 *
 *Recursion is basically breaking bigger problems into smaller problems
 * for n=4 if we find pow(n-1) * a. We have divided it into smaller problem.
 *
 * Second way is we can further reduce is in one more way
 * for a^10 Can we say it would be a^5 * a^5. If we find one a^5 it will be sorted.
 * This is for even case, In case of odd numbers
 * a^11 --> a^5 * a^5 * a
 *
 */

public class PowerOfN
{
    public static void main (String[] args)
    {
        int a = 2;
        int n = 6;
        PowerOfN powerOfN = new PowerOfN();
        System.out.println("Value of N is: "+ powerOfN.findPowerTwo(a, n));
        System.out.println("Value of N is: "+ powerOfN.findPower(a, n));
    }
    public int findPower (int a, int n) {
        if(n == 0) {
            return 1;
        }
        return a * findPower(a, n-1);
    }

    // We further optimized This problem as a^3 * a^3 = a^6
    // If we have to find for a^5 = a^4 * a --> a^2 * a^2 * a
    // We need to handle this in case of even nd odd.
    public int findPowerTwo (int a, int n) {
        if(n ==0) {
            return 1;
        }
        int res = findPower(a, n/2);
        if(n%2 == 0) {
            return res * res;
        } else {
            return res * res * a;
        }
    }
}
