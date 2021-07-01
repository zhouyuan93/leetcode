package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1837Test {

    T1837 t;

    @BeforeEach
    void setUp() {
        t = new T1837();
    }

    @Test
    void test_1() {
        int n = 34 ;
        int k= 6;
        int actual = t.sumBase(n, k);
        int expected = 9;
        assertEquals(expected,actual);
    }
}