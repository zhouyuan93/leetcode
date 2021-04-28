package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1354Test {

    T1354 t;

    @BeforeEach
    void setUp() {
        t = new T1354();
    }

    @Test
    void test_1() {
        int[] target = {9, 3, 5};
        boolean actual = t.isPossible(target);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[] target = {1, 1, 1, 2};
        boolean actual = t.isPossible(target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] target = {8, 5};
        boolean actual = t.isPossible(target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] target = {1,1000000000};
        boolean actual = t.isPossible(target);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_5() {
        int[] target = {1, 1, 1, 3};
        boolean actual = t.isPossible(target);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}