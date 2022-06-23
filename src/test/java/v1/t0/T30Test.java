package v1.t0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T30Test {

    T30 t = new T30();

    @Test
    void test_1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> actual = t.findSubstring(s, words);
        actual.sort(Comparator.naturalOrder());
        List<Integer> expected = Arrays.asList(0, 9);
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        List<Integer> actual = t.findSubstring(s, words);
        actual.sort(Comparator.naturalOrder());
        List<Integer> expected = Arrays.asList();
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        List<Integer> actual = t.findSubstring(s, words);
        actual.sort(Comparator.naturalOrder());
        List<Integer> expected = Arrays.asList(6,9,12);
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        List<Integer> actual = t.findSubstring(s, words);
        actual.sort(Comparator.naturalOrder());
        List<Integer> expected = Arrays.asList(8);
        assertEquals(expected,actual);
    }


    @Test
    void test_7() {
        String s = "ababababab";
        String[] words = {"ababa","babab"};
        List<Integer> actual = t.findSubstring(s, words);
        actual.sort(Comparator.naturalOrder());
        List<Integer> expected = Arrays.asList(0);
        assertEquals(expected,actual);
    }
}