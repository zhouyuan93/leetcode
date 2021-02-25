package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1276Test {

    T1276 t;

    @BeforeEach
    void setUp() {
        t = new T1276();
    }

    @Test
    void test_1() {
        int[] nums = {3, 6, 5, 1, 8};
        int actual = t.maxSumDivThree(nums);
        int expected = 18;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {4,4};
        int actual = t.maxSumDivThree(nums);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {2, 6, 2, 2, 7};
        int actual = t.maxSumDivThree(nums);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {4,1,5,3,1};
        int actual = t.maxSumDivThree(nums);
        int expected = 12;
        assertEquals(expected,actual);
    }
}