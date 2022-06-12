package weekend.d20220612;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void test() {
        int[] c = {6, 1, 3, 2, 2, 4, 1, 2};
        int k = 3;
        int a = t.distributeCookies(c, k);
        int e = 7;
        assertEquals(e, a);
    }

    @Test
    void test2() {
        int[] c = {9,1,1,1,1,1,1,1,1,1,1};
        int k = 3;
        int a = t.distributeCookies(c, k);
        int e = 9;
        assertEquals(e, a);
    }
}