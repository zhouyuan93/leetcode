package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t1300.T1385;

import static org.junit.jupiter.api.Assertions.*;

class T1385Test {

    T1385 t;

    @BeforeEach
    void setUp() {
        t = new T1385();
    }

    @Test
    void test_3() {
        int[] arr1 = new int[]{1,4,2,3};
        int[] arr2 = new int[]{-4,-3,6,10,20,30};
        int d = 3;
        int actual = t.findTheDistanceValue(arr1, arr2, d);
        int expect = 2;
        assertEquals(expect, actual);
    }
    @Test
    void test_2() {
        int[] arr1 = new int[]{2,1,100,3};
        int[] arr2 = new int[]{-5,-2,10,-3,7};
        int d = 6;
        int actual = t.findTheDistanceValue(arr1, arr2, d);
        int expect = 1;
        assertEquals(expect, actual);
    }
    @Test
    void test_1() {
        int[] arr1 = new int[]{4, 5, 8};
        int[] arr2 = new int[]{10, 9, 1, 9};
        int d = 2;
        int actual = t.findTheDistanceValue(arr1, arr2, d);
        int expect = 2;
        assertEquals(expect, actual);
    }
}