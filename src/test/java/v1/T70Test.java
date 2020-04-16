package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T70;

import static org.junit.jupiter.api.Assertions.*;

class T70Test {
    private T70 t;

    @BeforeEach
    void setUp() {
        t = new T70();
    }

    @Test
    void test4() {
        int x = 33;
        int actual = t.climbStairs(x);
        int expect = 5702887;
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        int x = 10;
        int actual = t.climbStairs(x);
        int expect = 89;
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        int x = 3;
        int actual = t.climbStairs(x);
        int expect = 3;
        assertEquals(expect, actual);
    }

    @Test
    void test1() {
        int x = 2;
        int actual = t.climbStairs(x);
        int expect = 2;
        assertEquals(expect, actual);
    }
}