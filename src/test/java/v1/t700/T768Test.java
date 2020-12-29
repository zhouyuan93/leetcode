package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T768Test {

    T768 t;

    @BeforeEach
    void setUp() {
        t = new T768();
    }

    @Test
    void test_1() {
        int[] arr = {5, 4, 3, 2, 1};
        int actual = t.maxChunksToSorted(arr);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {2,1,3,4,4};
        int actual = t.maxChunksToSorted(arr);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] arr = {2,1,3,4,3,4,4,5};
        int actual = t.maxChunksToSorted(arr);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] arr = {2,1,3,4,3,4,1,4,5};
        int actual = t.maxChunksToSorted(arr);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] arr = {0,0,1,1,1};
        int actual = t.maxChunksToSorted(arr);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int[] arr = {1,1,1,1,1};
        int actual = t.maxChunksToSorted(arr);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_7() {
        int[] arr = {5,1,1,8,1,6,5,9,7,8};
        int actual = t.maxChunksToSorted(arr);
        int expected = 1;
        assertEquals(expected,actual);
    }
}