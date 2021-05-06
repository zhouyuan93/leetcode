package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T797Test {

    T797 t;

    @BeforeEach
    void setUp() {
        t = new T797();
    }

    @Test
    void test_1() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> actual = t.allPathsSourceTarget(graph);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1, 3));
        expected.add(Arrays.asList(0, 2, 3));

        actual.stream().sorted();
        expected.stream().sorted();
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int[][] graph = {{1},{}};
        List<List<Integer>> actual = t.allPathsSourceTarget(graph);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1));

        actual.stream().sorted();
        expected.stream().sorted();
        assertEquals(expected,actual);
    }
}