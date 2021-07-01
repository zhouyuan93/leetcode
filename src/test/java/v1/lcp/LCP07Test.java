package v1.lcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCP07Test {

    LCP07 t;

    @BeforeEach
    void setUp() {
        t = new LCP07();
    }

    @Test
    void test_1() {
        int[][] relation = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
        int n = 5;
        int k = 3;
        int actual = t.numWays(n, relation, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] relation = {{0,1},{0,2},{2,1},{1,2},{1,0},{2,0}};
        int n = 3;
        int k = 5;
        int actual = t.numWays(n, relation, k);
        int expected = 11;
        assertEquals(expected,actual);
    }
}