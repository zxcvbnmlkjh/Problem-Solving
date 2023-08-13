package Abstract;

import Inheritance.Parent;

public abstract class ParentAbstract
{

    ParentAbstract() {

    }

    ParentAbstract (String name) {
        System.out.println("M in parent constructor");
    }
    public abstract void add ();

    public void multiply() {
        System.out.println("M in multiply");
    }
}
