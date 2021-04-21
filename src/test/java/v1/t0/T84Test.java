package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T84Test {

    T84 t;

    @BeforeEach
    void setUp() {
        t = new T84();
    }

    @Test
    void test_1() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int actual = t.largestRectangleArea(heights);
        int expected = 10;
        assertEquals(expected,actual);
    }
}