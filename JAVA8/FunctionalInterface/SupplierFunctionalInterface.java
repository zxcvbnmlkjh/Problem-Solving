package FunctionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * Supplier<T> is a functional interface. which has 0 I/p param and return 1 o/p param
 * get() This interface has a method called get which returns object of type T.
 */
public class SupplierFunctionalInterface
{
    public static void main (String[] args)
    {
        // Without Lambda

        Supplier supplier = new SupplierFunctionImpl();
        System.out.println(supplier.get());


        // With Lambda --> We have removed SupplierFunctionImpl class.
        Supplier supplierLambda = () -> LocalDateTime.now();
        System.out.println(supplierLambda.get());

    }
}
