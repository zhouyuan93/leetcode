package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T910Test {

    T910 t;

    @BeforeEach
    void setUp() {
        t = new T910();
    }

    @Test
    void test_1() {
        int[] A = {1};
        int K = 0;
        int actual = t.smallestRangeII(A, K);
        int expect = 0;
        assertEquals(expect,actual);
    }
    @Test
    void test_2() {
        int[] A = {0,10};
        int K = 2;
        int actual = t.smallestRangeII(A, K);
        int expect = 6;
        assertEquals(expect,actual);
    }
    @Test
    void test_3() {
        int[] A = {1,3,6};
        int K = 3;
        int actual = t.smallestRangeII(A, K);
        int expect = 3;
        assertEquals(expect,actual);
    }
    @Test
    void test_5() {
        int[] A = {1,2,3,4};
        int K = 3;
        int actual = t.smallestRangeII(A, K);
        int expect = 3;
        assertEquals(expect,actual);
    }
    @Test
    void test_4() {
        int[] A = {1,3,3};
        int K = 3;
        int actual = t.smallestRangeII(A, K);
        int expect = 2;
        assertEquals(expect,actual);
    }
}