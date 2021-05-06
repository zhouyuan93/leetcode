package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1460Test {

    T1460 t;

    @BeforeEach
    void setUp() {
        t = new T1460();
    }

    @Test
    void test_1() {
        int[] stoneValue = {1, 2, 3, 7};
        String actual = t.stoneGameIII(stoneValue);
        String expected = "Bob";
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[] stoneValue = {1, 2, 3, -9};
        String actual = t.stoneGameIII(stoneValue);
        String expected = "Alice";
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] stoneValue = {1, 2, 3, 6};
        String actual = t.stoneGameIII(stoneValue);
        String expected = "Tie";
        assertEquals(expected, actual);
    }


    @Test
    void test_4() {
        int[] stoneValue = {1};
        String actual = t.stoneGameIII(stoneValue);
        String expected = "Alice";
        assertEquals(expected, actual);
    }
}