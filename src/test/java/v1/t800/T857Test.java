package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T857Test {

    T857 t;

    @BeforeEach
    void setUp() {
        t = new T857();
    }

    @Test
    void test_1() {
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        int actual = t.minEatingSpeed(piles, H);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] piles = {30,11,23,4,20};
        int H = 6;
        int actual = t.minEatingSpeed(piles, H);
        int expected = 23;
        assertEquals(expected, actual);
    }
}