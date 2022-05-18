package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T668Test {

    T668 t;

    @BeforeEach
    void setUp() {
        t = new T668();
    }

    @Test
    void test_1() {
        int m = 3;
        int n = 3;
        int k = 5;
        assertEquals(3, t.findKthNumber(m, n, k));
    }

    @Test
    void test_2() {
        int m = 3;
        int n = 2;
        int k = 6;
        assertEquals(6, t.findKthNumber(m, n, k));
    }

    @Test
    void test_3() {
        int m = 3;
        int n = 2;
        int k = 5;
        assertEquals(4, t.findKthNumber(m, n, k));
    }
}