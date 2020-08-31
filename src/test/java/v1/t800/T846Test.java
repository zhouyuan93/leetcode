package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T846Test {
    T846 t;

    @BeforeEach
    void setUp() {
        t = new T846();
    }

    @Test
    void test_1() {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int w = 3;
        boolean actual = t.isNStraightHand(hand, w);
        boolean expect = true;
        assertEquals(expect, actual);
    }
    @Test
    void test_2() {
        int[] hand = {2,3,4,5,6,7,9};
        int w = 4;
        boolean actual = t.isNStraightHand(hand, w);
        boolean expect = false;
        assertEquals(expect, actual);
    }
    @Test
    void test_3() {
        int[] hand = {1,2,3,4,5,6,7,9};
        int w = 4;
        boolean actual = t.isNStraightHand(hand, w);
        boolean expect = false;
        assertEquals(expect, actual);
    }
}