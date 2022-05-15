package weekend.d20220515.templ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {

    T2 t = new T2();

    @Test
    void test_1() {
        int b = 2;
        int top = 9;
        int[] s = new int[]{4, 6};
        assertEquals(3,t.maxConsecutive(b, top, s));
    }
}