package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T451Test {

    T451 t;

    @BeforeEach
    void setUp() {
        t = new T451();
    }

    @Test
    void test_1() {
        String s = "tree";
        String str = t.frequencySort(s);
        System.out.println(str);
        Boolean actual = "eetr".equals(str) || "eert".equals(str);
        assertEquals(true, actual);
    }

    @Test
    void test_2() {
        String s = "Aabb";
        String str = t.frequencySort(s);
        System.out.println(str);
        Boolean actual = "bbAa".equals(str) || "bbaA".equals(str);
        assertEquals(true, actual);
    }
}