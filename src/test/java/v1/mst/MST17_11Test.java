package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_11Test {

    MST17_11 t;

    @BeforeEach
    void setUp() {
        t = new MST17_11();
    }

    @Test
    void test_1() {
        String[] words = {"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        String word1 = "a";
        String word2 = "student";
        int actual = t.findClosest(words, word1, word2);
        int expected = 1;
        assertEquals(expected,actual);
    }
}