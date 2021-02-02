package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T241Test {
    T241 t;

    @BeforeEach
    void setUp() {
        t = new T241();
    }

    @Test
    void test_1() {
        String input = "2-1-1";

        List<Integer> actual = t.diffWaysToCompute(input);
        List<Integer> expected = Arrays.asList(0, 2);

        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String input = "2*3-4*5";

        List<Integer> actual = t.diffWaysToCompute(input);
        List<Integer> expected = Arrays.asList(-34, -14, -10, -10, 10);

        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected,actual);
    }
}