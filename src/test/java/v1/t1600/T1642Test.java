package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1642Test {

    T1642 t;

    @BeforeEach
    void setUp() {
        t = new T1642();
    }

    @Test
    void test_1() {
        int[] height = new int[]{4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        int actual = t.furthestBuilding(height, bricks, ladders);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] height = new int[]{4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 0;
        int actual = t.furthestBuilding(height, bricks, ladders);
        int expected = 3;
        assertEquals(expected,actual);
    }
}