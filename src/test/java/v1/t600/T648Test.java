package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T648Test {
    T648 t;

    @BeforeEach
    void setUp() {
        t = new T648();
    }

    @Test
    void test_1() {
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String actual = t.replaceWords(dictionary, sentence);
        String expected = "the cat was rat by the bat";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        List<String> dictionary = Arrays.asList("a", "aa", "aaa", "aaaa");
        String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        String actual = t.replaceWords(dictionary, sentence);
        String expected = "a a a a a a a a bbb baba a";
        assertEquals(expected,actual);
    }
}