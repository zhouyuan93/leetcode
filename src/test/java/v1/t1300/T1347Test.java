package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1347Test {

    T1347 t;

    @BeforeEach
    void setUp() {
        t = new T1347();
    }

    @Test
    void test_1() {
        String s = "aba";
        String b = "bab";
        int actual = t.minSteps(s, b);
        int expected = 1;
        assertEquals(expected, actual);
    }
}