package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1037Test {

    T1037 t;

    @BeforeEach
    void setUp() {
        t = new T1037();
    }

    @Test
    void test_1() {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        boolean actual = t.isBoomerang(points);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        boolean actual = t.isBoomerang(points);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}