package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T202Test {
    T202 t;

    @BeforeEach
    void setUp() {
        t = new T202();
    }

    @Test
    void test_1() {
        boolean actual = t.isHappy(19);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void test_2() {
        boolean actual = t.isHappy(2);
        boolean expected = false;
        assertEquals(actual, expected);
    }
}