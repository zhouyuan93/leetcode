package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T556Test {

    T556 t;

    @BeforeEach
    void setUp() {
        t = new T556();
    }

    @Test
    void test_1() {
        assertEquals(21, t.nextGreaterElement(12));
    }


    @Test
    void test_2() {
        assertEquals(-1, t.nextGreaterElement(21));
    }

    @Test
    void test_3() {
        assertEquals(2138478669, t.nextGreaterElement(2138476986));
    }
}