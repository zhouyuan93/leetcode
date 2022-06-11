package weekend.d20220605;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void test() {
        int[] n = {1, 2};
        int[][] o = {{1, 3}, {2, 1}, {3, 2}};

        System.out.println(Arrays.toString(t.arrayChange(n, o)));
    }

    @Test
    void test2() {
        int[] n = {1, 2,4,6};
        int[][] o = {{1, 3}, {4, 7}, {6, 1}};
        int[] a = t.arrayChange(n, o);
        int[] e = new int[]{3, 2, 7, 1};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(e));

        assertArrayEquals(e,a);
    }
}