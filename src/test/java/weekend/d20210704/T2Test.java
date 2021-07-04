package weekend.d20210704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {
    T2 t = new T2();

    @Test
    void test_1() {
        int[] dist = {1, 3, 4};
        int[] speed = {1, 1, 1};
        int a = t.eliminateMaximum(dist, speed);
        int e = 3;
        assertEquals(e,a);
    }


    @Test
    void test_2() {
        int[] dist = {0, 1, 4};
        int[] speed = {1, 1, 1};
        int a = t.eliminateMaximum(dist, speed);
        int e = 0;
        assertEquals(e,a);
    }
}