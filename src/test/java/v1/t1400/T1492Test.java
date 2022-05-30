package v1.t1400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1492Test {
    T1492 t = new T1492();

    @Test
    void test_1() {
        int n = 12;
        int k = 3;
        int actual = t.kthFactor(n, k);
        int expected = 3;
        assertEquals(expected, actual);
    }
}