package weekend.d20220508;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4Test {
    T4 t = new T4();

    @Test
    void test1() {
        char[][] grid = {{'(', '(', '('},
                {')', '(', ')'},
                {'(', '(', ')'},
                {'(', '(', ')'}};
        assertEquals(true, t.hasValidPath(grid));
    }

    @Test
    void test2() {
        char[][] grid = {{'(', '('},
                {'(', '('},
                {'(', ')'}};
        assertEquals(false, t.hasValidPath(grid));
    }
}