package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1496Test {

    T1496 t;

    @BeforeEach
    void setUp() {
        t = new T1496();
    }

    @Test
    void test_1() {
        String path = "NESWW";
        boolean actual = t.isPathCrossing(path);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}