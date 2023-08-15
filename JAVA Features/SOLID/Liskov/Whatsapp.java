package SOLID.Liskov;

public class Whatsapp implements SocialMediaWhatsapp, SocialMediaInstagram
{
    @Override public void shareImages ()
    {
        System.out.println("Share images");
    }

    @Override public void groupCall ()
    {
        System.out.println("Group Call");
    }
}
