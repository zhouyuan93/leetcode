package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T121;

import static org.junit.jupiter.api.Assertions.*;

class T121Test {

    private T121 t;

    @BeforeEach
    void setUp() {
        t = new T121();
    }

    @Test
    void test_1() {
        int actual = t.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int expect = 5;
        assertEquals(expect,actual);
    }
}