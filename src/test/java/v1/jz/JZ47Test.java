package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ47Test {

    JZ47 t;

    @BeforeEach
    void setUp() {
        t = new JZ47();
    }

    @Test
    void test_1() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        int actual = t.maxValue(grid);
        int expected = 12;
        assertEquals(expected,actual);
    }
}