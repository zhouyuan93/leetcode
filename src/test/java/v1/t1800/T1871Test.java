package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class T1871Test {

    T1871 t;

    @BeforeEach
    void setUp() {
        t = new T1871();
    }

    @Test
    void test_1() {
        String s = "011010";
        int min = 2;
        int max = 3;
        assertTrue(t.canReach(s, min, max));
    }

    @Test
    void test_2() {
        String s = "01101110";
        int min = 2;
        int max = 3;
        assertFalse(t.canReach(s, min, max));
    }

    @Test
    void test_3() {
        String s = "01101101000";
        int min = 3;
        int max = 3;
        assertFalse(t.canReach(s, min, max));
    }

    @Test
    void test_4() {
        String s = "0110110000";
        int min = 3;
        int max = 3;
        assertTrue(t.canReach(s, min, max));
    }


    @Test
    void test_5() {
        String s = "0111110000";
        int min = 3;
        int max = 3;
        assertFalse(t.canReach(s, min, max));
    }

    @Test
    void test_6() {
        String s = "0010";
        int min = 3;
        int max = 3;
        assertEquals(true, t.canReach(s, min, max));
    }

    @Test
    void test_7() {
        String s = "011010";
        int min = 1;
        int max = 3;
        assertEquals(true, t.canReach(s, min, max));
    }


}