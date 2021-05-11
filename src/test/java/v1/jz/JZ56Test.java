package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JZ56Test {

    JZ56 t;

    @BeforeEach
    void setUp() {
        t = new JZ56();
    }

    @Test
    void test_1() {
        int[] nums = {4, 1, 4, 6};
        int[] actual = t.singleNumbers(nums);
        int[] expected = {1, 6};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,5,2};
        int[] actual = t.singleNumbers(nums);
        int[] expected = {1, 5};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}