package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T134Test {

    T134 t;

    @BeforeEach
    void setUp() {
        t = new T134();
    }

    @Test
    void test_1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int actual = t.canCompleteCircuit(gas, cost);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        int actual = t.canCompleteCircuit(gas, cost);
        int expected = -1;
        assertEquals(expected,actual);
    }
}