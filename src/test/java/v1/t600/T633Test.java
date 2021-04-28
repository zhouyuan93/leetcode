package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T633Test {

    T633 t;

    @BeforeEach
    void setUp() {
        t = new T633();
    }

    @Test
    void test_1() {
        assertEquals(true, t.judgeSquareSum(5));
    }

    @Test
    void test_2() {
        assertEquals(false, t.judgeSquareSum(3));
    }
    @Test
    void test_3() {
        assertEquals(true, t.judgeSquareSum(2));
    }
    @Test
    void test_4() {
        assertEquals(true, t.judgeSquareSum(1));
    }
}