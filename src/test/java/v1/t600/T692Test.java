package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T692Test {

    T692 t;

    @BeforeEach
    void setUp() {
        t = new T692();
    }

    @Test
    void test_1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> actual = t.topKFrequent(words, k);
        List<String> expected = Arrays.asList("i", "love");
        System.out.println(actual.toString());
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        String[] words = {"a","i", "love", "leetcode", "i", "love", "coding"};
        int k = 3;
        List<String> actual = t.topKFrequent(words, k);
        List<String> expected = Arrays.asList("i", "love","a");
        System.out.println(actual.toString());
        assertEquals(expected, actual);
    }
}