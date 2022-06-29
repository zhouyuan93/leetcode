package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST10_09Test {

    MST10_09 t;

    @BeforeEach
    void setUp() {
        t = new MST10_09();
    }

    @Test
    void test_1() {
        int[][] m = {{1, 1}};
        int n = 2;
        boolean actual = t.searchMatrix(m, n);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}