/**
 * To overcome with diamond problem we need to use InterfaceName.super.functionaname.
 *
 * Compiler will give you error if we dont override test method here.
 */
package DiamondProblem;

public class TestClass implements TestInterface1, TestInterface2
{
    @Override public void test ()
    {
        TestInterface2.super.test();
    }
}
