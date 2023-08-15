package SOLID.DependencyInversion;

public class SignatureCard implements Card
{
    @Override public void apply ()
    {
        System.out.println("SignatureCard Applied");
    }
}
