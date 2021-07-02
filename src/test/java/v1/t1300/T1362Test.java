package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1362Test {

    T1362 t;

    @BeforeEach
    void setUp() {
        t = new T1362();
    }

    @Test
    void test_1() {
        int num = 8;
        int[] actual = t.closestDivisors(num);
        int[] expected = {3, 3};
        assertArrayEquals(expected,actual);
    }
}