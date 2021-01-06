package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T357Test {

    T357 t;

    @BeforeEach
    void setUp() {
        t = new T357();
    }

    @Test
    void test_1() {
        int n = 2;
        int actual = t.countNumbersWithUniqueDigits(n);
        int expected = 91;
        assertEquals(expected,actual);
    }
}