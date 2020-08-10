package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1017Test {

    T1017 t;

    @BeforeEach
    void setUp() {
        t = new T1017();
    }

    @Test
    void test_1() {
        int n = 2;
        String actual = t.baseNeg2(n);
        String expect = "110";
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int n = 3;
        String actual = t.baseNeg2(n);
        String expect = "111";
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int n = 4;
        String actual = t.baseNeg2(n);
        String expect = "100";
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int n = 6;
        String actual = t.baseNeg2(n);
        String expect = "11010";
        assertEquals(expect, actual);
    }
}