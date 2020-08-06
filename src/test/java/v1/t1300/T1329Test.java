package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1329Test {

    T1329 t;

    @BeforeEach
    void setUp() {
        t = new T1329();
    }

    @Test
    void test_1() {
        int[][] nums = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] actual = t.diagonalSort(nums);
        int[][] expect = {{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        for (int[] a : actual) {
            System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < expect.length; i++) {
            assertArrayEquals(expect[i],actual[i]);
        }
    }
}