package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T509Test {
    T509 t;

    @BeforeEach
    void setUp() {
        t = new T509();
    }

    @Test
    void test_1() {
        int n = 3;
        int actual = t.fib(3);
        int expected = 2;
        assertEquals(expected,actual);
    }
}