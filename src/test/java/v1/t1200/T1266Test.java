package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1266Test {

    T1266 t;

    @BeforeEach
    void setUp() {
        t = new T1266();
    }

    @Test
    void test_1() {
        int[][] points = {{3, 2}, {-2, 2}};
        int actual = t.minTimeToVisitAllPoints(points);
        int expect = 5;
        assertEquals(expect, actual);
    }
}