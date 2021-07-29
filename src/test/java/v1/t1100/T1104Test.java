package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1104Test {
    T1104 t;

    @BeforeEach
    void setUp() {
        t = new T1104();
    }

    @Test
    void test_1() {
        int label = 14;
        List<Integer> a = t.pathInZigZagTree(label);
        List<Integer> e = Arrays.asList(1, 3, 4, 14);
        assertEquals(e, a);
    }

    @Test
    void test_2() {
        int label = 26;
        List<Integer> a = t.pathInZigZagTree(label);
        List<Integer> e = Arrays.asList(1, 2, 6, 10, 26);
        assertEquals(e, a);
    }

    @Test
    void test_3() {
        int label = 1;
        List<Integer> a = t.pathInZigZagTree(label);
        List<Integer> e = Arrays.asList(1);
        assertEquals(e, a);
    }
}