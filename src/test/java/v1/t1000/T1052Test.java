package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1052Test {

    T1052 t;

    @BeforeEach
    void setUp() {
        t = new T1052();
    }

    @Test
    void test_1() {
        int[] customer = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int x = 3;
        int actual = t.maxSatisfied(customer, grumpy, x);
        int expect = 16;
        assertEquals(expect, actual);
    }
}