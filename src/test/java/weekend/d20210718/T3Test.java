package weekend.d20210718;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {
    T3 t = new T3();

    @Test
    void test_1() {
        int[][] p= {{1,2,3},{1,5,1},{3,1,1}};
        long a = t.maxPoints(p);
        long e = 9;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        int[][] p= {};
        long a = t.maxPoints(p);
        long e = 0;
        assertEquals(e,a);
    }

    @Test
    void test_3() {
        int[][] p= {{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        long a = t.maxPoints(p);
        long e = 3;
        assertEquals(e,a);
    }

    @Test
    void test_4() {
        int[][] p= {{1,5},{2,3},{4,2}};
        long a = t.maxPoints(p);
        long e = 11;
        assertEquals(e,a);
    }

    @Test
    void test_5() {
        int[][] p= {{0,0,4,1,4},{2,1,2,0,1},
                {2,2,1,3,4},
                {5,2,4,5,4},
                {0,5,4,2,5}};
        long a = t.maxPoints(p);
        long e = 18;
        assertEquals(e,a);
    }
}