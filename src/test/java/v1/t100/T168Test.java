package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t100.T168;

import static org.junit.jupiter.api.Assertions.*;

class T168Test {
    T168 t;

    @BeforeEach
    void setUp() {
        t = new T168();
    }

    @Test
    void test_1() {
        String actual = t.convertToTitle(27);
        String expected = "AA";
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String actual = t.convertToTitle(3);
        String expected = "C";
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String actual = t.convertToTitle(256);
        String expected = "IV";
        assertEquals(expected, actual);
    }
}