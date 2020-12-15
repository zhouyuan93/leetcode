package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T319Test {

    T319 t;

    @BeforeEach
    void setUp() {
        t = new T319();
    }

    @Test
    void test_1() {
        int n = 3;
        int actual = t.bulbSwitch(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int n = 1;
        int actual = t.bulbSwitch(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int n = 11;
        int actual = t.bulbSwitch(n);
        int expected = 3;
        assertEquals(expected, actual);
    }
}