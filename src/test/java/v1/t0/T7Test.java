package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T7Test {

    T7 t;

    @BeforeEach
    void setUp() {
        t = new T7();
    }

    @Test
    void test_1() {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int x = 123;
        int actual = t.reverse(x);
        int expected = 321;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int x = 1534236469;
        int actual = t.reverse(x);
        int expected = 0;
        assertEquals(expected,actual);
    }
}