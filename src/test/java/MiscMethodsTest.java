import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscMethodsTest {


    @Test
    void fibonacci() {
        MiscMethods m = new MiscMethods();
        Assertions.assertEquals(21, m.Fibonacci(8));
        Assertions.assertEquals(1597, m.Fibonacci(17));
        Assertions.assertEquals(6765, m.Fibonacci(20));
        Assertions.assertEquals(2, m.Fibonacci(3));
        Assertions.assertEquals(3, m.Fibonacci(4));
    }

    @Test
    void sqrt() {
        MiscMethods m = new MiscMethods();
        Assertions.assertEquals(2.0,m.sqrt(4.0));
        Assertions.assertEquals(9.0,m.sqrt(81.0));
    }
}