package MultipleInheritance;

public interface B
{
    void test();

    default void add (){
        System.out.println("M in B");
    }

}
