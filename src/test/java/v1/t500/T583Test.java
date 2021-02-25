package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T583Test {

    T583 t;

    @BeforeEach
    void setUp() {
        t = new T583();
    }

    @Test
    void test_1() {
        String c1 = "sea";
        String c2 = "eat";
        int actual = t.minDistance(c1, c2);
        int expected = 2;
        assertEquals(expected,actual);
    }
}