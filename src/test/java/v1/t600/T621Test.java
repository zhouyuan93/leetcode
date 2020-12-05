package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T621Test {

    T621 t;

    @BeforeEach
    void setUp() {
        t = new T621();
    }

    @Test
    void test_1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int actual = t.leastInterval(tasks, n);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 0;
        int actual = t.leastInterval(tasks, n);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        char[] tasks = {'A', 'B'};
        int n = 2;
        int actual = t.leastInterval(tasks, n);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        char[] tasks = {'A', 'A'};
        int n = 2;
        int actual = t.leastInterval(tasks, n);
        int expected = 4;
        assertEquals(expected, actual);
    }
}