package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T1314Test {

    T1314 t;

    @BeforeEach
    void setUp() {
        t = new T1314();
    }

    @Test
    void test_1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        int[][] actual = t.matrixBlockSum(mat, k);
        int[][] expected = {{12, 21, 16}, {27, 45, 33}, {24, 39, 28}};
        for (int[] ints : actual) {
            System.out.println(Arrays.toString(ints));
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] mat = {{67,64,78},{99,98,38},{82,46,46},{6,52,55},{55,99,45}};
        int k = 3;
        int[][] actual = t.matrixBlockSum(mat, k);
        int[][] expected = {{731,731,731},{930,930,930},{930,930,930},{930,930,930},{721,721,721}};
        for (int[] ints : actual) {
            System.out.println(Arrays.toString(ints));
        }
        assertArrayEquals(expected, actual);
    }
}