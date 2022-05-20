package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T436Test {

    T436 t;

    @BeforeEach
    void setUp() {
        t = new T436();
    }

    @Test
    void test_1() {
        int[][] intervals = {{1, 2}};
        int[] actual = t.findRightInterval(intervals);
        int[] expected = {-1};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        int[] actual = t.findRightInterval(intervals);
        int[] expected = {-1, 0, 1};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] intervals = {{1, 4}, {2, 3}, {3, 4}};
        int[] actual = t.findRightInterval(intervals);
        int[] expected = {-1, 2, -1};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] intervals = {{1, 1},  {3, 4}};
        int[] actual = t.findRightInterval(intervals);
        int[] expected = {0, -1};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }
}