package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1025Test {
    T1025 t;

    @BeforeEach
    void setUp() {
        t = new T1025();
    }

    @Test
    void test_1() {
        int N = 5;
        boolean actual = t.divisorGame(N);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}