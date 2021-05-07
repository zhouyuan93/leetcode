package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T63Test {

    T63 t;

    @BeforeEach
    void setUp() {
        t = new T63();
    }

    @Test
    void test_1() {
        int[][] nums = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int actual = t.uniquePathsWithObstacles(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
}