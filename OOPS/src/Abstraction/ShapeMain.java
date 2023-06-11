package Abstraction;

public class ShapeMain
{
    public static void main (String[] args)
    {
        Shape s = new Rectangle();
        System.out.println(s.val);
        s.draw();
        s.add();
    }
}
