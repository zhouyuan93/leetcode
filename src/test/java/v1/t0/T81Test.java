package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T81Test {
    T81 t;

    @BeforeEach
    void setUp() {
        t = new T81();
    }

    @Test
    void test_1() {
        int[] num = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean actual = t.search(num, target);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] num = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean actual = t.search(num, target);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[] num = {2};
        int target = 3;
        boolean actual = t.search(num, target);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int[] num = {2};
        int target = 2;
        boolean actual = t.search(num, target);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_5() {
        int[] num = {};
        int target = 2;
        boolean actual = t.search(num, target);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_6() {
        int[] num = {1, 1, 3, 1};
        int target = 3;
        boolean actual = t.search(num, target);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_7() {
        int[] num = {1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 3;
        boolean actual = t.search(num, target);
        boolean expect = true;
        assertEquals(expect, actual);
    }
}