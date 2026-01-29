import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.JUnit.StringUtils;

class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    void setUp() {
        utils = new StringUtils();
    }

    @Test
    void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("level"));
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("java"));
        assertNull(utils.toUpperCase(null));
    }
}