package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1442Test {
    T1442 t;

    @BeforeEach
    void setUp() {
        t = new T1442();
    }

    @Test
    void test_1() {
        int[] arr = {2, 3, 1, 6, 7};
        int actual = t.countTriplets(arr);
        int expected = 4;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int[] arr = {1, 1, 1, 1, 1};
        int actual = t.countTriplets(arr);
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] arr = {2, 3};
        int actual = t.countTriplets(arr);
        int expected = 0;
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        int[] arr = {1,3,5,7,9};
        int actual = t.countTriplets(arr);
        int expected = 3;
        assertEquals(expected,actual);
    }

}