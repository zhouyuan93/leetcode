package weekend.d20220522.templ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4Test {

    T4 t = new T4();

    @Test
    void name() {
        int[] s = {5, 4, 6};
        assertEquals(213, t.totalStrength(s));
    }

    @Test
    void name1() {
        int[] s = {1,3,1,2};
        assertEquals(44, t.totalStrength(s));
    }

    @Test
    void name2() {
        int[] s = {13,13,12,12,13,12};
        assertEquals(8441, t.totalStrength(s));
    }

    @Test
    void name3() {
        int[] s = {13,13};
        assertEquals(676, t.totalStrength(s));

    }

    @Test
    void name4() {
        int[] s = {8,1,8,5};
        assertEquals(290, t.totalStrength(s));
    }

    @Test
    void name5() {
        int[] s = {15,1,13,7,14,2,15};
        assertEquals(2227, t.totalStrength(s));
    }
}