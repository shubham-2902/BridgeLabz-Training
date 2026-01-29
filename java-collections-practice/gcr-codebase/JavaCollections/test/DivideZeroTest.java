import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JUnit.DivideZero;

class DivideZeroTest {

    @Test
    void testDivideByZeroThrowsException() {
        DivideZero dc = new DivideZero();

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            dc.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testDivideNormalCase() {
        DivideZero dc = new DivideZero();
        assertEquals(2, dc.divide(10, 5));
    }
}