package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T645Test {

    T645 t;

    @BeforeEach
    void setUp() {
        t = new T645();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 2, 4};
        int[] actual = t.findErrorNums(nums);
        int[] expected = {2, 3};
        assertArrayEquals(expected,actual);
    }
}