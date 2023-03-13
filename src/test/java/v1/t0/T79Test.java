package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T79Test {

    T79 t;

    @BeforeEach
    void setUp() {
        t = new T79();
    }

    @Test
    void test_1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean actual = t.exist(board, word);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABCESEEEFS";
        boolean actual = t.exist(board, word);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}