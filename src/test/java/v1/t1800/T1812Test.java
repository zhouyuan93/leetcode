package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1812Test {
    T1812 t;

    @BeforeEach
    void setUp() {
        t = new T1812();
    }

    @Test
    void test_1() {
        String s = "a1";
        boolean actual = t.squareIsWhite(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "h3";
        boolean actual = t.squareIsWhite(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}