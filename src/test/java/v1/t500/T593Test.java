package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T593Test {

    T593 t;

    @BeforeEach
    void setUp() {
        t = new T593();
    }

    @Test
    void test_1() {
        int[] p1 = {0,0};
        int[] p2 = {1,1};
        int[] p3 = {1,0};
        int[] p4 = {0, 1};
        boolean actual = t.validSquare(p1, p2, p3, p4);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}