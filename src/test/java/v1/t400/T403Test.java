package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T403Test {

    T403 t;

    @BeforeEach
    void setUp() {
        t = new T403();
    }

    @Test
    void test_1() {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        boolean actual = t.canCross(stones);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] stones = {0, 1, 2, 3, 4, 8, 9, 11};
        boolean actual = t.canCross(stones);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] stones = {0, 2};
        boolean actual = t.canCross(stones);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] stones = {0, 1, 3, 6, 10, 15, 16, 21};
        boolean actual = t.canCross(stones);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}