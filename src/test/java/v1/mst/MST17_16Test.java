package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_16Test {

    MST17_16 t;

    @BeforeEach
    void setUp() {
        t = new MST17_16();
    }

    @Test
    void test_1() {
        int[] nums = {1,2,3,1};
        int actual = t.massage(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {2,7,9,3,1};
        int actual = t.massage(nums);
        int expected = 12;
        assertEquals(expected, actual);
    }
}