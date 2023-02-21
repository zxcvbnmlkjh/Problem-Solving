
//https://intellipaat.com/blog/interview-question/java-8-interview-questions/
package FunctionalInterface;

import java.util.function.Function;

public class CustomFunctionalInterfaceImpl
{
    public static void main (String[] args)
    {
        CustomFunctionalInterfaceImpl cc = new CustomFunctionalInterfaceImpl();
        cc.test(() -> System.out.println("testinggggggg"));

    }
    public void test (CustomInterface c) {
        c.add();
    }

    private interface CustomInterface {

        void add();
    }
}
