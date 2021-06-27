package weekend.d20210627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void test_1() {
        String w = "aba";
        long a = t.wonderfulSubstrings(w);
        assertEquals(4,a);
    }

    @Test
    void test_2() {
        String w = "aabb";
        long a = t.wonderfulSubstrings(w);
        assertEquals(9,a);
    }
}