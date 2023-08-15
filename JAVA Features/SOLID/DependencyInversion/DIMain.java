package SOLID.DependencyInversion;

public class DIMain
{
    public static void main (String[] args)
    {
        Bank bank = new Bank(new RegaliaCard());
        bank.applyCard();
    }
}
