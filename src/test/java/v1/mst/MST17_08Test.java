package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MST17_08Test {

    MST17_08 t;

    @BeforeEach
    void setUp() {
        t = new MST17_08();
    }

    @Test
    void test_1() {
        int[] height = {65, 70, 56, 75, 60, 68};
        int[] weight = {100, 150, 90, 190, 95, 110};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] height = {65, 65, 65, 70, 56, 75, 60, 68};
        int[] weight = {191, 99, 100, 150, 90, 190, 95, 110};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] height = {1, 1, 2, 2, 3, 3, 5, 5};
        int[] weight = {1, 1, 2, 2, 4, 3, 3, 6};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] height = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        int[] weight = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[] height = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4};
        int[] weight = {1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 1};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[] height = {1,2,3,4,5,6,7,8};
        int[] weight = {11,22,33,4,5,6,7,8};
        int actual = t.bestSeqAtIndex(height, weight);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_quick_sort() {
        int[] height = {65, 70, 56, 75, 60, 68};
        int[] weight = {100, 150, 90, 190, 95, 110};
        t.quickSort(height, weight, 0, height.length - 1);
        int[] h = {56, 60, 65, 68, 70, 75};
        int[] w = {90, 95, 100, 110, 150, 190};
        assertArrayEquals(h, height);
        assertArrayEquals(w, weight);
    }

}