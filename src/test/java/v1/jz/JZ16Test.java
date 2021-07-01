package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ16Test {

    JZ16 t;

    @BeforeEach
    void setUp() {
        t = new JZ16();
    }

    @Test
    void test_1() {
        double actual = t.myPow(2, 2);
        double expected = 4;
        assertEquals(expected, actual);
    }
}