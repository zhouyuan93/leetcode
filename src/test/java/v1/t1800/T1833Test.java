package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1833Test {

    T1833 t;

    @BeforeEach
    void setUp() {
        t = new T1833();
    }

    @Test
    void test_1() {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        int actual = t.maxIceCream(costs, coins);
        int expected = 4;
        assertEquals(expected, actual);
    }
}