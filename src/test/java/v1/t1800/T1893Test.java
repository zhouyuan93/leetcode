package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1893Test {

    T1893 t;

    @BeforeEach
    void setUp() {
        t = new T1893();
    }

    @Test
    void test_1() {
        int[][] ranges = {
                {1, 2}, {3, 4}, {5, 6}
        };
        int left = 2;
        int right = 5;
        boolean a = t.isCovered(ranges, left, right);
        boolean e = true;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        int[][] ranges = {
                {1,1}, {3, 3}, {4, 4}
        };
        int left = 3;
        int right = 3;
        boolean a = t.isCovered(ranges, left, right);
        boolean e = true;
        assertEquals(e,a);
    }
}