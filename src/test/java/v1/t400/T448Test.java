package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T448Test {

    T448 t;

    @BeforeEach
    void setUp() {
        t = new T448();
    }

    @Test
    void test_1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> actual = t.findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(5, 6);
        assertEquals(expected, actual);
    }
}