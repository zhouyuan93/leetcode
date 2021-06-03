package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1277Test {

    T1277 t;

    @BeforeEach
    void setUp() {
        t = new T1277();
    }

    @Test
    void test_1() {
        int[][] matrix = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        int actual = t.countSquares(matrix);
        int expected = 15;
        assertEquals(expected, actual);
    }
}