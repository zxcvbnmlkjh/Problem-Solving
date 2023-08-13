package Inheritance;

public class MainInheritance
{
    public static void main (String[] args)
    {
        Child child = new Child();
        child.haveHouse();
        child.haveCar();
        child.getschoolName();

        Parent p = new Child();
        p.haveHouse();
        p.name = "ddd";
        child.name = "fjdfd";

    }
}
