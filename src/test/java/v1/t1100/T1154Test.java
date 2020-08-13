package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1154Test {

    T1154 t;

    @BeforeEach
    void setUp() {
        t = new T1154();
    }

    @Test
    void test_1() {
        String date = "2020-01-09";
        int actual = t.dayOfYear(date);
        int expect = 9;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        String date = "2020-03-01";
        int actual = t.dayOfYear(date);
        int expect = 61;
        assertEquals(expect, actual);
    }
}