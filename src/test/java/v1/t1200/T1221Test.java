package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1221Test {
    T1221 t;

    @BeforeEach
    void setUp() {
        t = new T1221();
    }

    @Test
    void test_1() {
        String s = "RLRRLLRLRL";
        int actual = t.balancedStringSplit(s);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "RLLLLRRRLR";
        int actual = t.balancedStringSplit(s);
        int expected = 3;
        assertEquals(expected,actual);
    }
}