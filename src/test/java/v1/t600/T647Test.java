package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T647Test {

    T647 t;

    @BeforeEach
    void setUp() {
        t = new T647();
    }

    @Test
    void test_1() {
        String s = "abacaba";
        int actual = t.countSubstrings(s);
        int expect = 12;
        assertEquals(expect,actual);
    }
}