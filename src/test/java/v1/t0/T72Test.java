package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T72Test {

    T72 t;

    @BeforeEach
    void setUp() {
        t = new T72();
    }

    @Test
    void test_1() {
        String word1 = "horse";
        String word2 = "ros";
        int actual = t.minDistance(word1, word2);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String word1 = "intention";
        String word2 = "execution";
        int actual = t.minDistance(word1, word2);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String word1 = "";
        String word2 = "e";
        int actual = t.minDistance(word1, word2);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String word1 = "dinitrophenylhydrazine";
        String word2 = "benzalphenylhydrazone";
        int actual = t.minDistance(word1, word2);
        int expected = 7;
        assertEquals(expected,actual);
    }
}