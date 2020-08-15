package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T546Test {

    T546 t;

    @BeforeEach
    void setUp() {
        t = new T546();
    }

    @Test
    void test_1() {
        int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        int actual = t.removeBoxes(boxes);
        int expect = 23;
        assertEquals(expect, actual);
    }
}