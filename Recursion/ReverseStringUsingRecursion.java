/**
 * One Approach is with String builder
 *
 * Second approach is swap logic in recursive way
 */
public class ReverseStringUsingRecursion
{
    StringBuilder sb = new StringBuilder();
    public static void main (String[] args)
    {
        String name = "Priyanka";
        ReverseStringUsingRecursion reverseStringUsingRecursion = new ReverseStringUsingRecursion();
        System.out.println("String is:"+ reverseStringUsingRecursion.checkReverse(name , name.length()-1));


        System.out.println("String is:"+ reverseStringUsingRecursion.check(name));
    }

    // First Way
    public String checkReverse (String name , int i) {

        if(i < 0) {
            return sb.toString();
        }
        sb.append(name.charAt(i));
        return checkReverse(name, i-1);
    }


    // Better Approach using Recursion
    // P + riyanka --> r + iyanka --> i + yanka --> a
    public String check (String name) {

        if(name.length() <= 0) {
            return name;
        }

        return check(name.substring(1)) + name.charAt(0);
    }
}
