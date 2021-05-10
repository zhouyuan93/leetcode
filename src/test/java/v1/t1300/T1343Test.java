package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1343Test {

    T1343 t;

    @BeforeEach
    void setUp() {
        t = new T1343();
    }

    @Test
    void test_1() {
        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k = 3, threshold = 5;
        int actual = t.numOfSubarrays(arr, k, threshold);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3, threshold = 4;
        int actual = t.numOfSubarrays(arr, k, threshold);
        int expected = 3;
        assertEquals(expected, actual);
    }
}