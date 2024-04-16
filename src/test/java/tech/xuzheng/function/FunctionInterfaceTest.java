package tech.xuzheng.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionInterfaceTest {
    @Test
    public void testFunction() {
        Function<String, Integer> StringParser = Integer::parseInt;
        Integer num = 1;
        String numStr = Integer.toString(num);
        Assertions.assertEquals(num, StringParser.apply(numStr));
    }


    @Test
    public void testSupplier() {
        String testStr = "test";
        String supplierGet = supplierGet((unit) -> testStr);
        Assertions.assertEquals(supplierGet, testStr);
    }

    @Test
    public void testExecutable() {
        Executable executable = unit -> {
            System.out.print("111111");
            return Unit.getInstance();
        };
        executable.execute();
    }

    private String supplierGet(Supplier<String> supplier) {
        return supplier.get();
    }
}
