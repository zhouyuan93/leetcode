package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class T1096Test {

    T1096 t;

    @BeforeEach
    void setUp() {
        t = new T1096();
    }

    @Test
    void test_1() {
        String s = "a";
        List<String> actual = t.braceExpansionII(s).stream().sorted().collect(Collectors.toList());
        List<String> expected = Arrays.asList("a").stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "ab";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("ab");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "ab{c,d}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("abc","abd");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String s = "a{b,c}d";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("abd","acd");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String s = "{a,b}{c,d}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("ac","ad","bc","bd");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }
    @Test
    void test_6() {
        String s = "a{b,c}{d,e}f{g,h}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("abdfg", "abdfh", "abefg", "abefh", "acdfg", "acdfh", "acefg", "acefh");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_7() {
        String s = "{a,b}{c,{d,e}}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("ac","ad","ae","bc","bd","be");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_8() {
        String s = "{{a,z},a{b,c},{ab,z}}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("a","ab","ac","z");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_9() {
        String s = "{{a,z},a{b,c},{ab,z}}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("a","ab","ac","z");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void test_10() {
        String s = "{a,b}{c,{d,e}}";
        List<String> actual = t.braceExpansionII(s);
        List<String> expected = Arrays.asList("ac","ad","ae","bc","bd","be");

        expected = expected.stream().sorted().collect(Collectors.toList());
        actual = actual.stream().sorted().collect(Collectors.toList());
        assertEquals(expected, actual);
    }
}