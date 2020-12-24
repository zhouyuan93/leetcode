package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T135Test {
    T135 t;

    @BeforeEach
    void setUp() {
        t = new T135();
    }

    @Test
    void test_1() {
        int[] ratings = {1, 0, 2};
        int actual = t.candy(ratings);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] ratings = {1,2,2};
        int actual = t.candy(ratings);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] ratings = {1,2,3,2,1,1,2,3};
        int actual = t.candy(ratings);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] ratings = {1,2,3,3,1,1,2,3};
        int actual = t.candy(ratings);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] ratings = {2};
        int actual = t.candy(ratings);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int[] ratings = {1,3,4,5,2};
        int actual = t.candy(ratings);
        int expected = 11;
        assertEquals(expected,actual);
    }

    @Test
    void test_7() {
        int[] ratings = {1,2,2};
        int actual = t.candy(ratings);
        int expected = 4;
        assertEquals(expected,actual);
    }
}