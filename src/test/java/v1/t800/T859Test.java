package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T859Test {

    T859 t;

    @BeforeEach
    void setUp() {
        t = new T859();
    }

    @Test
    void test_1() {
        String a = "adsdsdsfsdf";
        String b = "adsadssfsdf";
        boolean actual = t.buddyStrings(a, b);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String a = "ab";
        String b = "ba";
        boolean actual = t.buddyStrings(a, b);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String a = "ab";
        String b = "ba";
        boolean actual = t.buddyStrings(a, b);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String a = "ab";
        String b = "ca";
        boolean actual = t.buddyStrings(a, b);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String a = "abac";
        String b = "abad";
        boolean actual = t.buddyStrings(a, b);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}