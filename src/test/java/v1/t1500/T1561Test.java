package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1561Test {

    T1561 t;

    @BeforeEach
    void setUp() {
        t = new T1561();
    }

    @Test
    void test_1() {
        int[] piles = {2, 4, 1, 2, 7, 8};
        int actual = t.maxCoins(piles);
        int expected = 9;
        assertEquals(expected,actual);
    }
}