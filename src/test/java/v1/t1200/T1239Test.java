package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1239Test {

    T1239 t;

    @BeforeEach
    void setUp() {
        t = new T1239();
    }

    @Test
    void test_1() {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        int actual = t.maxLength(arr);
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        List<String> arr = Arrays.asList("cha","r","act","ers");
        int actual = t.maxLength(arr);
        int expect = 6;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        List<String> arr = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p");
        int actual = t.maxLength(arr);
        int expect = 16;
        assertEquals(expect, actual);
    }
}