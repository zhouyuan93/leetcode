package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1410Test {

    T1410 t;

    @BeforeEach
    void setUp() {
        t = new T1410();
    }

    @Test
    void test_1() {
        String text = "&amp;";
        String actual = t.entityParser(text);
        String expected = "&";
        assertEquals(expected, actual);
    }
}