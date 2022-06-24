package v1.t1800;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1815Test {

    T1815 t = new T1815();

    @Test
    void test() {
        int[][] intervals = {{1, 4}, {2, 4}, {3, 6}, {4, 4}};
        int[] queries = {2, 3, 4, 5};
        int[] actual = t.minInterval(intervals, queries);
        int[] expected = {3, 3, 1, 4};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);
    }
}