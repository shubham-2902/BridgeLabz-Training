import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JUnit.DateFormatter;

class DateFormatterTest {

    private DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("28-01-2026", formatter.formatDate("2026-01-28"));
        assertEquals("01-12-2025", formatter.formatDate("2025-12-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("28-01-2026");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-02-30");
        });
    }
}