package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T289Test {
    T289 t;

    @BeforeEach
    void setUp() {
        t = new T289();
    }

    @Test
    void test_1() {
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        t.gameOfLife(board);
        int[][] expect = {
                {0,0,0},
                {1,0,1},
                {0,1,1},
                {0,1,0}
        };
        for (int[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("-------------");
        for (int[] ints : expect) {
            System.out.println(Arrays.toString(ints));
        }
        assertArrayEquals(expect,board);
    }
}