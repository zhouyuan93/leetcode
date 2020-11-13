package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1018Test {

    T1018 t;

    @BeforeEach
    void setUp() {
        t = new T1018();
    }

    @Test
    void test_1() {
        int[] nums = {0, 1, 1};
        List<Boolean> actual = t.prefixesDivBy5(nums);
        List<Boolean> expected = Arrays.asList(true, false, false);
        assertEquals(expected, actual);
    }
}