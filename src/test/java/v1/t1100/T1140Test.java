package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1140Test {

    T1140 t;

    @BeforeEach
    void setUp() {
        t = new T1140();
    }

    @Test
    void test_1() {
        int[] piles = new int[]{2, 7, 8, 4, 4};
        int actual = t.stoneGameII(piles);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] piles = new int[]{2,7,9,4,4,3,2,1,3,4,5,6,11,2,1,3,1,22};
        int actual = t.stoneGameII(piles);
        int expected = 44;
        assertEquals(expected, actual);
    }
}