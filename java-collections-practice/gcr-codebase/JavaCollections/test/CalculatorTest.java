

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.JUnit.Calculator;

public class CalculatorTest {

		private Calculator calc;

		@BeforeEach
		void setUp() {
			calc = new Calculator();
		}

		@Test
		void testAdd() {
			assertEquals(5, calc.add(2, 3));
			assertEquals(-1, calc.add(2, -3));
		}

		@Test
		void testSubtract() {
			assertEquals(1, calc.subtract(3, 2));
			assertEquals(-5, calc.subtract(2, 7));
		}

		@Test
		void testMultiply() {
			assertEquals(6, calc.multiply(2, 3));
			assertEquals(0, calc.multiply(5, 0));
		}

		@Test
		void testDivide() {
			assertEquals(2, calc.divide(10, 5));
			assertEquals(-2, calc.divide(10, -5));
		}

		@Test
		void testDivideByZero() {
			Exception exception = assertThrows(ArithmeticException.class, () -> {
				calc.divide(10, 0);
			});

			assertEquals("Cannot divide by zero", exception.getMessage());
		}
	}

