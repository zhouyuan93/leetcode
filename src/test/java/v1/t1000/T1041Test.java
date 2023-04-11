package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1041Test {

    T1041 t;

    @BeforeEach
    void setUp() {
        t = new T1041();
    }

    @Test
    void test_1() {
        String s = "GGLLGG";
        boolean actual = t.isRobotBounded(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}