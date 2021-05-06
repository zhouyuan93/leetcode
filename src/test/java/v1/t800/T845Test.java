package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T845Test {

    T845 t;

    @BeforeEach
    void setUp() {
        t = new T845();
    }

    @Test
    void test_1() {
        int[] A = {2, 1, 4, 7, 3, 2, 5};
        int actual = t.longestMountain(A);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] A = {1,2,2,2,1};
        int actual = t.longestMountain(A);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] A = {1,2,3,1,2,2,3,4,5};
        int actual = t.longestMountain(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] A = {875,884,239,731,723,685};
        int actual = t.longestMountain(A);
        int expected = 4;
        assertEquals(expected, actual);
    }
}