package weekend.d20220612;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4Test {

    T4 t = new T4();

    @Test
    void test() {
        String[] s = {"coffee", "donuts", "time", "toffee"};
        long a = t.distinctNames(s);
        long e = 6;
        assertEquals(e,a);

    }

    @Test
    void test2() {
        String[] s = {"lack","back"};
        long a = t.distinctNames(s);
        long e = 0;
        assertEquals(e,a);

    }

    @Test
    void test3() {
        String[] s = {"lack","back","l"};
        long a = t.distinctNames(s);
        long e = 4;
        assertEquals(e,a);

    }
}