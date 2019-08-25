package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T500Test {

    T500 t;
    @BeforeEach
    void setUp() {
        t = new T500();
    }

    @Test
    void test_1() {
        String[] s = {"Hello", "Alaska", "Dad", "Peace"};
        String[] actual = t.findWords(s);
        String[] expected = {"Alaska", "Dad"};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_2() {
        String[] s = {"wwww"};
        String[] actual = t.findWords(s);
        String[] expected = {"wwww"};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_3() {
        String[] s = {""};
        String[] actual = t.findWords(s);
        String[] expected = {""};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_4() {
        String[] s = {"ZXVCBNMzxvcbnm"};
        String[] actual = t.findWords(s);
        String[] expected = {"ZXVCBNMzxvcbnm"};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_5() {
        String[] s = {"asdfghjklASDFGHJKL"};
        String[] actual = t.findWords(s);
        String[] expected = {"asdfghjklASDFGHJKL"};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_6() {
        String[] s = {"qwertyuiop"};
        String[] actual = t.findWords(s);
        String[] expected = {"qwertyuiop"};
        assertArrayEquals(expected, actual);
    }
}