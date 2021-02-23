package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1537Test {

    T1537 t;

    @BeforeEach
    void setUp() {
        t = new T1537();
    }

    @Test
    void test_1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int actual = t.diagonalSum(mat);
        int expected = 25;
        assertEquals(expected,actual);
    }
}