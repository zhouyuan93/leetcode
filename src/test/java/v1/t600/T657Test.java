package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T657Test {
    T657 t;

    @BeforeEach
    void setUp() {
        t = new T657();
    }

    @Test
    void test_1() {
        String moves = "RLUD";
        boolean actual = t.judgeCircle(moves);
        boolean expect = true;
        assertEquals(expect, actual);
    }
}