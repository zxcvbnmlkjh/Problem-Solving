package Abstraction;

public class Rectangle extends Shape
{
    @Override void draw ()
    {
        System.out.println("M in draw method of Rect");
    }

    void add() {
        System.out.println("M in add method of Rect");
    }
}
