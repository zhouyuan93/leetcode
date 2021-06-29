package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T785Test {
    
    T785 t;

    @BeforeEach
    void setUp() {
        t = new T785();
    }

    @Test
    void test_1() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean actual = t.isBipartite(graph);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean actual = t.isBipartite(graph);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}