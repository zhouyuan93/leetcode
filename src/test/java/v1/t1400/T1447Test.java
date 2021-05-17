package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1447Test {

    T1447 t;

    @BeforeEach
    void setUp() {
        t = new T1447();
    }

    @Test
    void test_1() {
        int n = 2;
        List<String> actual = t.simplifiedFractions(n);
        List<String> expected = Arrays.asList("1/2");
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 3;
        List<String> actual = t.simplifiedFractions(n);
        List<String> expected = Arrays.asList("1/2","1/3","2/3");
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 4;
        List<String> actual = t.simplifiedFractions(n);
        List<String> expected = Arrays.asList("1/2","1/3","1/4","2/3","3/4");
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int n = 1;
        List<String> actual = t.simplifiedFractions(n);
        List<String> expected = Collections.emptyList();
        assertEquals(expected,actual);
    }
}