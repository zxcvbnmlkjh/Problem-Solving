package FunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierFunctionImpl implements Supplier
{
    @Override public Object get ()
    {
        return LocalDateTime.now();
    }
}
