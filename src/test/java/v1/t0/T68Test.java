package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T68Test {
    T68 t;

    @BeforeEach
    void setUp() {
        t = new T68();
    }

    @Test
    void test_1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> actual = t.fullJustify(words, maxWidth);
        List<String> expected = Arrays.asList("This    is    an",
                "example  of text",
                "justification.  ");
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> actual = t.fullJustify(words, maxWidth);
        List<String> expected = Arrays.asList("What   must   be",
                "acknowledgment  ",
                "shall be        ");
        assertEquals(expected, actual);
    }
}