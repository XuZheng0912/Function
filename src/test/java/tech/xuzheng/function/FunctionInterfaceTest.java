package tech.xuzheng.function;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class FunctionInterfaceTest {
    @Test
    public void testFunction() {
        Function<String, Integer> stringIntegerParser = s -> {
            if (StringUtils.isBlank(s)) {
                return 0;
            }
            return Integer.parseInt(s);
        };
        Assertions.assertEquals(41, stringIntegerParser.apply("41"));
    }
}
