package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1443Test {

    T1443 t;

    @BeforeEach
    void setUp() {
        t = new T1443();
    }

    @Test
    void test_1() {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApples = Arrays.asList(false, false, true, false, true, true, false);
        int actual = t.minTime(n, edges, hasApples);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    void test_2() {
        int n = 4;
        int[][] edges = {{0, 2}, {0, 3}, {1, 2}};
        List<Boolean> hasApples = Arrays.asList(false, true, false, false);
        int actual = t.minTime(n, edges, hasApples);
        int expected = 4;
        assertEquals(actual, expected);
    }
}