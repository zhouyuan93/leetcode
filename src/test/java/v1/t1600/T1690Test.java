package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1690Test {

    T1690 t;

    @BeforeEach
    void setUp() {
        t = new T1690();
    }

    @Test
    void test_1() {
        int[] stones = {5, 3, 1, 4, 2};
        int actual = t.stoneGameVII(stones);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] stones = {7, 90, 5, 1, 100, 10, 10, 2};
        int actual = t.stoneGameVII(stones);
        int expected = 122;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] stones = {7};
        int actual = t.stoneGameVII(stones);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] stones = {481, 905, 202, 250, 371, 628, 92, 604, 836, 338, 676, 734};
        int actual = t.stoneGameVII(stones);
        int expected = 3459;
        assertEquals(expected, actual);
    }
}