package Abstract;


// By default all the methods in an interface is abstract and public so no need to explictly specify that.


public interface Animal
{
     void walk();

     void eat();

     default void sleep () {
          System.out.print("M sleeping");
     }

     default void test () {
          System.out.print("M sleeping");
     }

}
