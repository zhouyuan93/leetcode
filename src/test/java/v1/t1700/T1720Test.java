package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1720Test {

    T1720 t;

    @BeforeEach
    void setUp() {
        t = new T1720();
    }

    @Test
    void test_1() {
        int[] encoding = {1, 2, 3};
        int first = 1;
        int[] actual = t.decode(encoding, first);
        int[] expected = {1, 0, 2, 1};
        assertArrayEquals(expected,actual);
    }
}