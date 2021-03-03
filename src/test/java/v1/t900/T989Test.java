package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T989Test {
    T989 t;

    @BeforeEach
    void setUp() {
        t = new T989();
    }

    @Test
    void test_1() {
        int[] A = {2, 7, 4};
        int K = 181;
        List<Integer> actual = t.addToArrayForm(A, K);
        List<Integer> expected = Arrays.asList(4, 5, 5);
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] A = {2, 7, 4};
        int K = 1181;
        List<Integer> actual = t.addToArrayForm(A, K);
        List<Integer> expected = Arrays.asList(1, 4, 5, 5);
        assertEquals(expected, actual);
    }
}