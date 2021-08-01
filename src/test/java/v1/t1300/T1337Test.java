package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T1337Test {

    T1337 t;

    @BeforeEach
    void setUp() {
        t = new T1337();
    }

    @Test
    void test_1() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k  = 3;
        int[] a = t.kWeakestRows(mat, k);
        int[] e = {2, 0, 3};
        System.out.println(Arrays.toString(a));
        assertArrayEquals(e,a);
    }
}