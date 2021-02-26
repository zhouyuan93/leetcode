package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1178Test {
    T1178 t;

    @BeforeEach
    void setUp() {
        t = new T1178();
    }

    @Test
    void test_1() {
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> actual = t.findNumOfValidWords(words, puzzles);
        List<Integer> expected = Arrays.asList(1, 1, 3, 2, 4, 0);
        assertEquals(expected,actual);
    }
}