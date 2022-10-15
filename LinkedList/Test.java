import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

    @FunctionalInterface
    interface Test1{
        void add(); //SAM

        default void sub(){

        }

        static void num() {

        }
    }

    public static void main(String[] args) {

    }
}
/*
 4 In built function interface
     Predicate -- boolean // test method

     consumer -- accept // takes i/p No o/p
      supplier -- get o/p
      function -- apply
      Optional
      Map or Flat map
      Streams & Parallel Streams

*/
