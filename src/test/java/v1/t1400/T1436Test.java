package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1436Test {

    T1436 t;

    @BeforeEach
    void setUp() {
        t = new T1436();
    }

    @Test
    void test_1() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));
        String actual = t.destCity(paths);
        String expected = "A";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("a", "b"));
        paths.add(Arrays.asList("b", "c"));
        paths.add(Arrays.asList("c", "d"));
        String actual = t.destCity(paths);
        String expected = "d";
        assertEquals(expected,actual);
    }
}