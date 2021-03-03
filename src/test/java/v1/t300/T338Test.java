package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T338Test {

    T338 t;

    @BeforeEach
    void setUp() {
        t = new T338();
    }

    @Test
    void test_1() {
        int num = 5;
        int[] actual = t.countBits(num);
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected,actual);
    }
}