package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T130Test {

    T130 t;

    @BeforeEach
    void setUp() {
        t = new T130();
    }

    @Test
    void test_1() {

        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};

        t.solve(board);

        char[][] expect = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};

        assertArrayEquals(board, expect);
    }

    @Test
    void test_2() {

        char[][] board = {{'X'}};

        t.solve(board);

        char[][] expect = {{'X'}};

        assertArrayEquals(board, expect);
    }

    @Test
    void test_3() {

        char[][] board = {
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}};

        t.solve(board);

        char[][] expect = {
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}};

        assertArrayEquals(board, expect);
    }
}