package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T868Test {

    T868 t;

    @BeforeEach
    void setUp() {
        t = new T868();
    }

    @Test
    void test_1() {
        int actual = t.binaryGap(22);
        int expected = 2;
        assertEquals(expected, actual);
    }
}