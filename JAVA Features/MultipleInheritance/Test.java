package MultipleInheritance;

public class Test implements A,B
{
    @Override public void test ()
    {
        System.out.println("Impl class");
    }

    @Override public void add ()
    {
        A.super.add();
    }

}
