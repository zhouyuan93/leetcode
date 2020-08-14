package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T717Test {
    T717 t;

    @BeforeEach
    void setUp() {
        t = new T717();
    }

    @Test
    void test_1() {
        int[] bits = {1, 1, 1, 0, 0};
        boolean actual = t.isOneBitCharacter(bits);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] bits = {1, 1, 1, 0};
        boolean actual = t.isOneBitCharacter(bits);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[] bits = {1, 0};
        boolean actual = t.isOneBitCharacter(bits);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int[] bits = {0, 0, 0, 1, 0};
        boolean actual = t.isOneBitCharacter(bits);
        boolean expect = false;
        assertEquals(expect, actual);
    }
}