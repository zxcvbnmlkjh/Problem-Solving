package Abstract;

public class ChildAbstract extends ParentAbstract
{
    ChildAbstract() {

    }
    ChildAbstract(String name) {

        super(name);
        System.out.println("M in child constructor");
    }
    @Override public void add ()
    {
        System.out.println("M in child abstract");
    }

    public void sub () {
        System.out.println("M in sub");
    }
}
