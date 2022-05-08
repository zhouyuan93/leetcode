package weekend.d20220508;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void test1() {
        String keys = "22233";
        assertEquals(8, t.countTexts(keys));
    }

    @Test
    void test11() {
        String keys = "2";
        assertEquals(1, t.countTexts(keys));
    }

    @Test
    void test111() {
        String keys = "222222222222222222222222222222222222";
        assertEquals(82876089, t.countTexts(keys));
    }
}