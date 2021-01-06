package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T399Test {

    T399 t;

    @BeforeEach
    void setUp() {
        t = new T399();
    }

    @Test
    void test_1() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        double[] actual = t.calcEquation(equations, values, queries);
        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("e", "f"));
        equations.add(Arrays.asList("b", "e"));
        double[] values = {3.4, 1.4, 2.3};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "f"));
        queries.add(Arrays.asList("f", "f"));
        queries.add(Arrays.asList("e", "e"));
        queries.add(Arrays.asList("c", "c"));
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("f", "e"));

        double[] actual = t.calcEquation(equations, values, queries);
        double[] expected = {0.29412, 10.948, 1.0, 1.0, -1.0, -1.0, 0.71429};

        System.out.println(Arrays.toString(actual));

        for (int i = 0; i < actual.length; i++) {
            assertTrue(Math.abs(expected[i] - actual[i]) < 0.00001);
        }
    }

    @Test
    void test_3() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("c", "b"));
        equations.add(Arrays.asList("d", "b"));
        equations.add(Arrays.asList("w", "x"));
        equations.add(Arrays.asList("y", "x"));
        equations.add(Arrays.asList("z", "x"));
        equations.add(Arrays.asList("w", "d"));
        double[] values = {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "c"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));
        queries.add(Arrays.asList("a", "z"));

        double[] actual = t.calcEquation(equations, values, queries);
        double[] expected = {0.66667, 0.33333, -1.0, 1.0, 1.0, 0.04464};

        System.out.println(Arrays.toString(actual));

        for (int i = 0; i < actual.length; i++) {
            assertTrue(Math.abs(expected[i] - actual[i]) < 0.00001);
        }
    }
}