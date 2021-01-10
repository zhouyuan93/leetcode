package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T228Test {

    T228 t;

    @BeforeEach
    void setUp() {
        t = new T228();
    }

    @Test
    void test_1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> actual = t.summaryRanges(nums);
        List<String> expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected,actual);
    }
}