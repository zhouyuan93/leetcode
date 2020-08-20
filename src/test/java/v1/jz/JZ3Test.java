package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JZ3Test {

    JZ3 t ;

    @BeforeEach
    void setUp() {
        t = new JZ3();
    }

    @Test
    void test_1() {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int actual = t.findRepeatNumber(nums);
        List<Integer> expect = Arrays.asList(2, 3);
        assertEquals(true, expect.contains(actual));
    }
}