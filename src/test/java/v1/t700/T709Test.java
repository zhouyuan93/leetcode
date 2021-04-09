package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T709Test {

    T709 t;

    @BeforeEach
    void setUp() {
        t = new T709();
    }

    @Test
    void test_1() {
        String str = "abAB";
        String actual = t.toLowerCase(str);
        String expected = "abab";
        assertEquals(expected, actual);
    }
}