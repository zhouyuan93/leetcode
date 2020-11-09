package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T969Test {
    T969 t;

    @BeforeEach
    void setUp() {
        t = new T969();
    }

    @Test
    void test_packing() {
        int[] arr = {3, 2, 4, 1};
        int[] expected = {1, 4, 2, 3};
        t.pancaking(arr, 4);
        assertArrayEquals(expected, arr);
    }

    @Test
    void test_1() {
        int[] arr = {3, 2, 4, 1};

        int[] actual = Arrays.copyOf(arr, arr.length);
        int[] expected = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expected);

        List<Integer> res = t.pancakeSort(arr);
        for (Integer k : res) {
            t.pancaking(actual,k);
        }

        boolean notOut = res.size() < 10 * arr.length;
        assertTrue(notOut);

        assertArrayEquals(expected, actual);

    }
}