package SOLID.DependencyInversion;

public class RegaliaCard implements Card
{
    @Override public void apply ()
    {
        System.out.println("RegaliaCard Applied");
    }
}
