package v1.t2000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T2032Test {

    T2032 t;

    @BeforeEach
    void setUp() {
        t = new T2032();
    }

    @Test
    void test_1() {
        int[] x = {1, 1, 3, 2};
        int[] y = {2, 3};
        int[] z = {3};
        List<Integer> actual = t.twoOutOfThree(x, y, z);
        actual.sort(Comparator.comparingInt(n -> n));
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected,actual);
    }
}