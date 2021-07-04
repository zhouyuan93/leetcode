package weekend.d20210704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void t1() {
        assertEquals(5,t.countGoodNumbers(1));
    }


    @Test
    void t2() {
        assertEquals(400,t.countGoodNumbers(4));
    }


    @Test
    void t3() {
        assertEquals(2000,t.countGoodNumbers(5));
    }


    @Test
    void t4() {
        assertEquals(564908303,t.countGoodNumbers(50));
    }

    @Test
    void t5() {
        assertEquals(600642257,t.countGoodNumbers(34));
    }

    @Test
    void tt() {
        int n = 50 ;

        for (int i = 0; i < n; i++) {
            System.out.println(i +" " + t.countGoodNumbers(i) +  " " + t.t2(i));
        }
        System.out.println(999999111l * 999999111l % 1000000007);
    }

    @Test
    void ttt() {
        System.out.println(400160566 * 4 % 1000000007);
    }
}
