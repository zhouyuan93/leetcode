package weekend.d20220508;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {
    T1 t = new T1();

    @Test
    void test1() {
        String num = "6777144449";
        assertEquals("777",t.largestGoodInteger(num));
    }

    @Test
    void test2() {
        String num = "2300019";
        assertEquals("000",t.largestGoodInteger(num));
    }

    @Test
    void test3() {
        String num = "230022";
        assertEquals("",t.largestGoodInteger(num));
    }


}