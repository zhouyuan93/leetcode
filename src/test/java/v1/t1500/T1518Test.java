package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1518Test {

    T1518 t;

    @BeforeEach
    void setUp() {
        t = new T1518();
    }

    @Test
    void test_1() {
        int actual = t.numWaterBottles(9, 3);
        int expected = 13;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int actual = t.numWaterBottles(15, 4);
        int expected = 19;
        assertEquals(expected,actual);
    }
}