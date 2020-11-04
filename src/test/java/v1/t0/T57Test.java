package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T57Test {
    T57 t;

    @BeforeEach
    void setUp() {
        t = new T57();
    }

    @Test
    void test_1() {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2, 5};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,5},{6,9}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,2},{3,10},{12,16}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_3() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {2,3};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,5}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_4() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {1,7};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,7}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_5() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {6,8};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,5},{6,8}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_6() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {0,3};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{0,5}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_7() {
        int[][] intervals = {{1,3},{6,8},{9,9}};
        int[] newInterval = {7,8};
        int[][] actual = t.insert(intervals, newInterval);
        int[][] expected = {{1,3},{6,8},{9,9}};
        assertEquals(expected.length,actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}