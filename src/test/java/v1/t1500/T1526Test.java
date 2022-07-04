package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1526Test {

    T1526 t;

    @BeforeEach
    void setUp() {
        t = new T1526();
    }

    @Test
    void test_1() {
        int[] target = {1, 2, 3, 2, 1};
        int actual = t.minNumberOperations(target);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] target = {3,1,1,2};
        int actual = t.minNumberOperations(target);
        int expected = 4;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        int[] target = {3,1,5,4,2};
        int actual = t.minNumberOperations(target);
        int expected = 7;
        assertEquals(expected,actual);
    }

}