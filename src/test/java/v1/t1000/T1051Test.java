package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1051Test {

    T1051 t;

    @BeforeEach
    void setUp() {
        t = new T1051();
    }

    @Test
    void test_1() {
        int[] heights = {5, 1, 2, 3, 4};
        int actual = t.heightChecker(heights);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] heights = {1,1,4,2,1,3};
        int actual = t.heightChecker(heights);
        int expected = 3;
        assertEquals(expected, actual);
    }
}