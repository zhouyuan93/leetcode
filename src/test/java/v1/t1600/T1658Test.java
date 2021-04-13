package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1658Test {

    T1658 t;

    @BeforeEach
    void setUp() {
        t = new T1658();
    }

    @Test
    void test_1() {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        int actual = t.minOperations(nums, x);
        int expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    void test_2() {
        int[] nums = {5,6,7,8,9};
        int x = 4;
        int actual = t.minOperations(nums, x);
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    void test_3() {
        int[] nums = {3,2,20,1,1,3};
        int x = 10;
        int actual = t.minOperations(nums, x);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int x = 134365;
        int actual = t.minOperations(nums, x);
        int expected = 16;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] nums = {1,1,1};
        int x = 3;
        int actual = t.minOperations(nums, x);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int[] nums = {5,2,3,1,1};
        int x = 5;
        int actual = t.minOperations(nums, x);
        int expected = 1;
        assertEquals(expected,actual);
    }
}