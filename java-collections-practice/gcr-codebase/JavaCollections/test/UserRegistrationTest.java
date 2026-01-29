import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JUnit.UserRegistration;

class UserRegistrationTest {

    private UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("shubham", "shubham@mail.com", "pass123");
        });
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user@mail.com", "pass123");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user", "usermail.com", "pass123");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user", "user@mail.com", "123");
        });
    }
}