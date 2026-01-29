import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JUnit.PasswordValidator;

class PasswordValidatorTest {

    private PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("JavaTest9"));
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testNoUppercaseLetter() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}