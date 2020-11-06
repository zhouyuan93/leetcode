package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T883Test {

    T883 t;

    @BeforeEach
    void setUp() {
        t = new T883();
    }

    @Test
    void test_1() {
        int[][] grid = {{2}};
        int actual = t.projectionArea(grid);
        int expected = 5;
        assertEquals(expected, actual);
    }
}