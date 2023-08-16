package AnonymousClass;

public class FuncInterfaceMain
{
    public static void main (String[] args)
    {
        FuncInterface func = new FuncInterface()
        {
            @Override public void add (int x)
            {
                System.out.println("M in add " + x);
            }
        };
        func.add(34);

        // Write it in Lambda function

        FuncInterface fobj = (x)->  System.out.println("M in add " + 2*x);

        FuncInterface1 fobj1 = (x) ->  System.out.println("M in add " + 2*x);
        fobj.add(45);
        fobj.add(67);
    }
}
