package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T42;

import static org.junit.jupiter.api.Assertions.*;

class T42Test {

    T42 t;

    @BeforeEach
    void setUp() {
        t = new T42();
    }

    @Test
    void test_2() {
        int[] height = new int[]{4,2,0,3,2,5};
        int actual = t.trap(height);
        int excepted = 9;
        assertEquals(excepted, actual);
    }
    @Test
    void test_1() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int actual = t.trap(height);
        int excepted = 6;
        assertEquals(excepted, actual);
    }
}