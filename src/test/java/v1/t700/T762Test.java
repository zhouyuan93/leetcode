package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T762Test {

    T762 t;

    @BeforeEach
    void setUp() {
        t = new T762();
    }

    @Test
    void test_1() {
        int actual = t.countPrimeSetBits(6, 10);
        int expected = 4;
        assertEquals(expected,actual);
    }
}