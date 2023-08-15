/**
 * In this example your child class Instagram is completely replacable by its parent class SocialMediaInstagram
 */

package SOLID.Liskov;

public class Instagram implements SocialMediaInstagram
{
    @Override public void shareImages ()
    {
        System.out.println("Share images");
    }
}
