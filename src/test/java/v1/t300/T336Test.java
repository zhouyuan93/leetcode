package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T336Test {

    T336 t;

    @BeforeEach
    void setUp() {
        t = new T336();
    }

    @Test
    void test_1() {
        String[] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> actual = t.palindromePairs(words);
        List<List<Integer>> expect = new ArrayList<List<Integer>>(){{
            add(Arrays.asList(0, 1));
            add(Arrays.asList(1, 0));
            add(Arrays.asList(3, 2));
            add(Arrays.asList(2, 4));
        }};
        assertEquals(expect, actual);
    }
}