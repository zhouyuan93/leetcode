package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T405Test {

    T405 t;

    @BeforeEach
    void setUp() {
        t = new T405();
    }

    @Test
    void test_1() {
        int num = 26;
        String actual = t.toHex(num);
        String expect = "1a";
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int num = -1;
        String actual = t.toHex(num);
        String expect = "ffffffff";
        assertEquals(expect, actual);
    }
}