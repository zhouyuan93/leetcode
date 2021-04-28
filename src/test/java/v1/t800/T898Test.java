package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T898Test {

    T898 t;

    @BeforeEach
    void setUp() {
        t = new T898();
    }

    @Test
    void test_1() {
        int[] nums = {0};
        int actual = t.subarrayBitwiseORs(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,1,2};
        int actual = t.subarrayBitwiseORs(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] nums = {1,2,4};
        int actual = t.subarrayBitwiseORs(nums);
        int expected = 6;
        assertEquals(expected, actual);
    }
}