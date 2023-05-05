package v1.t2400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T2456Test {

    T2456 t;

    @BeforeEach
    void setUp() {
        t = new T2456();
    }

    @Test
    void test_1() {
        String[] c = {"a"};
        String[] i = {"a"};
        int[] v = {0};
        List<List<String>> actual = t.mostPopularCreator(c, i, v);
        List<List<String>> expected = Arrays.asList(Arrays.asList("a", "a"));

    }
}