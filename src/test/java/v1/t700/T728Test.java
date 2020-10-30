package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T728Test {
    T728 t;

    @BeforeEach
    void setUp() {
        t = new T728();
    }

    @Test
    void test_1() {
        int left = 1;
        int right = 22;
        List<Integer> actual = t.selfDividingNumbers(left, right);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(expected,actual);
    }
}