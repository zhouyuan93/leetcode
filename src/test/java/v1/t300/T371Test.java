package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T371Test {
    T371 t;

    @BeforeEach
    void setUp() {
        t = new T371();
    }

    @Test
    void test_1() {
        int a = 3;
        int b = 4;
        int actual = t.getSum(a, b);
        int expect = 7;
        assertEquals(expect,actual);
    }

    @Test
    void test_2() {
        int a = 113;
        int b = 124;
        int actual = t.getSum(a, b);
        int expect = 237;
        assertEquals(expect,actual);
    }

    @Test
    void test_3() {
        int a = -3;
        int b = 4;
        int actual = t.getSum(a, b);
        int expect = 1;
        assertEquals(expect,actual);
    }
}