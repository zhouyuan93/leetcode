package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1791Test {

    T1791 t;

    @BeforeEach
    void setUp() {
        t = new T1791();
    }

    @Test
    void test_1() {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        int actual = t.findCenter(edges);
        int expected = 2;
        assertEquals(expected, actual);
    }
}