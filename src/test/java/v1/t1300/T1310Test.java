package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1310Test {

    T1310 t;

    @BeforeEach
    void setUp() {
        t = new T1310();
    }

    @Test
    void test_1() {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        int[] actual = t.xorQueries(arr, queries);
        int[] expected = {2, 7, 14, 8};
        assertArrayEquals(expected, actual);
    }
}