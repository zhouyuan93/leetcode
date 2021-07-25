package weekend.d20210725;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void name() {
        int[][] st ={{1,1,0},{1,0,1},{0,0,1}};
        int[][] me = {{1,0,0},{0,0,1},{1,1,0}};
        int a = t.maxCompatibilitySum(st, me);
        assertEquals(6,a);
    }



    @Test
    void name1() {
        int[][] st = {{0,0},{0,0},{0,1},{0,1}};
        int[][] me = {{0,0},{0,0},{1,1},{1,1}};
        int a = t.maxCompatibilitySum(st, me);
        assertEquals(0,a);
    }

    @Test
    void name11() {
        int[][] st = {{0,0,1,0,0,0,0,0},{1,1,0,1,0,0,0,0},{1,0,0,1,1,0,0,0},{1,0,1,1,1,1,1,0},{1,1,0,1,1,0,1,0},{0,1,0,0,0,1,1,1},{1,0,0,0,1,0,0,1},{1,0,0,1,1,1,0,1}};
        int[][] me = {{1,1,0,0,0,1,0,0},{1,1,1,1,0,1,0,0},{1,0,0,1,1,0,0,1},{1,1,1,0,0,0,1,0},{1,0,0,0,1,0,1,1},{1,0,1,1,0,1,0,0},{1,1,0,1,1,0,1,0},{0,1,0,0,0,1,0,0}};
        int a = t.maxCompatibilitySum(st, me);
        assertEquals(49,a);
    }
}