package v1.t2000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2055Test {

    T2055 t = new T2055();

    @Test
    void test_1() {
        String s = "**|**|***|";
        int[][] queries = {{2, 5}, {5, 9}};
        int[] actual = t.platesBetweenCandles(s, queries);
        int[] expected = {2, 3};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_2() {
        String s = "***|**|*****|**||**|*";
        int[][] queries = {{4,5},{14, 17}, {5, 11}};
        int[] actual = t.platesBetweenCandles(s, queries);
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_3() {
        String s = "***";
        int[][] queries = {{2,2}};
        int[] actual = t.platesBetweenCandles(s, queries);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
}