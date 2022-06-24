package v1.t800;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class T816Test {

    T816 t = new T816();

    @Test
    void test_1() {
        String s = "(123)";
        List<String> actual = t.ambiguousCoordinates(s);
        actual = actual.stream().sorted().collect(Collectors.toList());
        List<String> expected = new ArrayList<>();
        expected.add("(1, 23)");
        expected.add("(1, 2.3)");
        expected.add("(12, 3)");
        expected.add("(1.2, 3)");
        expected = expected.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);

    }

    @Test
    void test_2() {
        String s = "(1000)";
        List<String> actual = t.ambiguousCoordinates(s);
        actual = actual.stream().sorted().collect(Collectors.toList());
        List<String> expected = new ArrayList<>();
        expected.add("(100, 0)");
        expected = expected.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);

    }

    @Test
    void test_3() {
        String s = "(01000)";
        List<String> actual = t.ambiguousCoordinates(s);
        actual = actual.stream().sorted().collect(Collectors.toList());
        List<String> expected = new ArrayList<>();
        expected.add("(0, 1000)");
        expected = expected.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);

    }

    @Test
    void test_4() {
        String s = "(00011)";
        List<String> actual = t.ambiguousCoordinates(s);
        actual = actual.stream().sorted().collect(Collectors.toList());
        List<String> expected = new ArrayList<>();
        expected.add("(0, 0.011)");
        expected.add("(0.001, 1)");
        expected = expected.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);

    }

    @Test
    void test_5() {
        String s = "(1010)";
        List<String> actual = t.ambiguousCoordinates(s);
        actual = actual.stream().sorted().collect(Collectors.toList());
        List<String> expected = new ArrayList<>();
        expected.add("(10, 10)");
        expected.add("(1.01, 0)");
        expected.add("(10.1, 0)");
        expected.add("(101, 0)");
        expected = expected.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);

    }
}