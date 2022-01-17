package v1.t1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1220Test {

    T1220 t = new T1220();

    @Test
    void test_1() {
        int n = 0;
        int actual = t.countVowelPermutation(n);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 1;
        int actual = t.countVowelPermutation(n);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 2;
        int actual = t.countVowelPermutation(n);
        int expected = 10;
        assertEquals(expected,actual);
    }

}