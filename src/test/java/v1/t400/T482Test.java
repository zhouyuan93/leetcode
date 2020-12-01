package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T482Test {
    T482 t;

    @BeforeEach
    void setUp() {
        t = new T482();
    }

    @Test
    void test_1() {
        String s = "5F3Z-2e-9-w";
        String actual = t.licenseKeyFormatting(s, 4);
        String expected = "5F3Z-2E9W";
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "2-5g-3-J";
        String actual = t.licenseKeyFormatting(s, 2);
        String expected = "2-5G-3J";
        assertEquals(expected, actual);
    }
}