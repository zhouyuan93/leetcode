package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T96Test {

    T96 t;

    @BeforeEach
    void setUp() {
        t = new T96();
    }

    @Test
    void test_1() {
        int actual = t.numTrees(4);
        int expected = 14;
        assertEquals(expected, actual);
    }
}