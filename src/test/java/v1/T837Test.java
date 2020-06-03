package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T837Test {
    T837 t;

    @BeforeEach
    void setUp() {
        t = new T837();
    }

    @Test
    void test_6() {
        int N = 24;
        int K = 17;
        int W = 10;
        double actual = t.new21Game(N, K, W);
        double expected = 0.94529;
        System.out.println("[0.0, 0.8, 0.8800000000000001, 0.968, 0.9648, 0.96128, 0.9574079999999998, 0.9531487999999999, 0.9484636799999999, 0.9433100480000001, 0.9376410528000001, 0.9314051580800001, 0.9445456738880003, 0.9510002412768002, 0.9493002654044801, 0.9477502919449281, 0.9463973211394208, 0.9452962532533629]");
        System.out.println("test_6:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        assertEquals(true, res);
    }

    @Test
    void test_5() {
        int N = 3;
        int K = 3;
        int W = 3;
        double actual = t.new21Game(N, K, W);
        double expected = 0.59259;
        System.out.println("test_3:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        //[0.0, 0.3333333333333333, 0.4444444444444444, 0.5925925925925926]
        assertEquals(true, res);
    }

    @Test
    void test_4() {
        int N = 7597;
        int K = 4797;
        int W = 5726;
        double actual = t.new21Game(N, K, W);
        double expected = 0.74386;
        System.out.println("test_3:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        assertEquals(true, res);
    }

    @Test
    void test_3() {
        int N = 21;
        int K = 17;
        int W = 10;
        double actual = t.new21Game(N, K, W);
        double expected = 0.73278;
        System.out.println("[0.0, 0.5, 0.55, 0.605, 0.6655, 0.73205, 0.805255, 0.7857805, 0.7643585500000001, 0.740794405, 0.7148738454999999, 0.68636123005, 0.7049973530549999, 0.7204970883605, 0.7320467971965499, 0.738701476916205, 0.7393666246078255, 0.7327777870686081]");
        System.out.println("test_3:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        assertEquals(true, res);
    }

    @Test
    void test_2() {
        int N = 6;
        int K = 1;
        int W = 10;
        double actual = t.new21Game(N, K, W);
        double expected = 0.60000;
        System.out.println("test_2:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        assertEquals(true, res);
    }

    @Test
    void test_1() {
        int N = 10;
        int K = 1;
        int W = 10;
        double actual = t.new21Game(N, K, W);
        double expected = 1.00000;
        System.out.println("test_1:" + actual);
        boolean res = Math.abs(expected - actual) < 0.00001;
        assertEquals(true, res);
    }
}