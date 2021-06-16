package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T877Test {

    T877 t;

    @BeforeEach
    void setUp() {
        t = new T877();
    }

    @Test
    void test_1() {
        int[] piles = new int[]{5, 3, 4, 5};
        boolean actual = t.stoneGame(piles);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}