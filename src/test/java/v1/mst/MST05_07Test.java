package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST05_07Test {

    MST05_07 t;

    @BeforeEach
    void setUp() {
        t = new MST05_07();
    }

    @Test
    void test_1() {
        int actual = t.exchangeBits(3);
        int expected = 3;
        assertEquals(expected,actual);
    }
}