package MultipleInheritance;

public interface A
{
    void test();

    default void add (){
        System.out.println("M in A");
    }
}
